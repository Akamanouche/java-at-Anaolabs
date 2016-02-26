#!/bin/sh

# -----------------------------------------------------------------------------
# Releasing scripts
# 
# This script aims to :
# 1) check coherence of release
# 2) then calls external script for bumping POM(s)
# 3) then does specific update
# 
# Usage:
# 	> bash /path/to/release.sh -r <release version> [-j <JIRA ref>]
#
# ## STEPS are :
#	1) [GIT] Check branch issuing release
#	2) [GIT] Creating a specific branch for release
#	3) [MAVEN] Bumping versions
#	4) [MAVEN] Launch a DEV build
#	5) [MAVEN] Launch a PROD build
# 	6) ...
#	7) ...
#
# ## Source d'inspiration
#	- mydoc: ../Link to DELIVERY-DWH-in-PRODUCTION-version2@EASYTRUST.txt
#
# -----------------------------------------------------------------------------

# Constants
RELEASE_PREFIX="release-"

USAGE="usage : bash ./release.sh -r <release version> [-j <JIRA ref>]" 

logStep() {
	echo "==========================================================="
	echo "[RELEASING] STEP: $1"
	echo "==========================================================="
}

logError() {
	echo "[ERROR] $1"
	echo "    ==> $2"
}


# Check parameters
if [ $# -eq 0 ]
then
	logError "At least, a RELEASE version MUST BE given !..." "$USAGE"
    exit 1
fi 

while getopts ":r:j:" opt; do
  case $opt in
    r)
		export RELEASE_VERSION=$OPTARG
		;;
    j)
		export JIRA_REF=$OPTARG
   	    ;;
	:)
		logError "Missing option argument for: -$OPTARG" "$USAGE"
		exit 1
		;;
	\?)
		logError "Unknown option: -$OPTARG" "$USAGE"
		exit 1
		;;
  esac
done

echo "Asked Release parameters :" 
echo -e "\t- RELEASE : $RELEASE_VERSION"
echo -e "\t- JIRA_REF : $JIRA_REF"


# RELEASE PROCESS starts here...
# ------------------------------

# 1) [GIT] Check branch issuing release
logStep "1) Checking branch for releasing process..."

# [RULE 1] From Branch for releasing MUST BE "develop"
export CURRENT_BRANCH=`git name-rev --name-only HEAD`
if [ ! $CURRENT_BRANCH == "develop" ]
then
	logError "Current branch MUST BE 'develop' (is currently: '$CURRENT_BRANCH') !" "Please: switch to 'develop'"
	exit 1
fi

CURDIR=`dirname $0`

# 2) [GIT] Creating a specific branch for release
BRANCH_FOR_RELEASE=$RELEASE_PREFIX$RELEASE_VERSION
logStep "2) Creating BRANCH for RELEASE: \"$BRANCH_FOR_RELEASE\""
git checkout -b $BRANCH_FOR_RELEASE
sleep 2

# 3) [MAVEN] Bumping versions
logStep "3) Bumping versions"
bash "$CURDIR/bump-for-release.sh" $RELEASE_VERSION

# 5) [MAVEN] Launch a DEV build
logStep "4) BUILDING in DEV Mode (with Tests)"
mvn clean install -P DEV

if [ ! $? -eq 0 ]
then
	logError "Build in DEV mode (with test) has failed !" "Fix it"
	exit 1
fi


# 5) [MAVEN] Launch a PROD build
logStep "5) BUILDING PROD binaries"
mvn clean install -P PROD

if [ ! $? -eq 0 ]
then
	logError "Build in PROD has failed !" "Fix it"
	exit 1
fi


