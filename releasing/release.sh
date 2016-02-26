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
#	2) [MAVEN] Bumping versions
#	3) [GIT] Creating a specific branch for release
#	4) [MAVEN/SPEC] Call Release build specifics
# 	5) [GIT] Add and commit bumping version
#	6) [GIT] Push branch of release
#	7) [GITHUB/API] Do a Pull Request from (branch --> master)
#	8) [GITHUB/API] Force Merge Pull Request
#	9) [GITHUB/API] Draft a new release / tag
#
# ## Source d'inspiration
#	- mydoc: ../Link to DELIVERY-DWH-in-PRODUCTION-version2@EASYTRUST.txt
#
# -----------------------------------------------------------------------------

# Constants
RELEASE_PREFIX="release-"
CURDIR=`dirname $0`
USAGE="usage : bash ./release.sh -r <release version> [-j <JIRA ref>]" 

# source commons
source "$CURDIR/commons.sh" 


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



#### STEP 1 : [GIT] Check branch issuing release
logStep "1) Checking from-branch for releasing process..."

# [RULE 1] From Branch for releasing MUST BE "develop"
export CURRENT_BRANCH=`git name-rev --name-only HEAD`
if [ ! $CURRENT_BRANCH == "develop" ]
then
	logError "Current from-branch MUST BE 'develop' (is currently: '$CURRENT_BRANCH') !" "Please: switch to 'develop'"
	exit 1
fi


#### STEP 2 : [MAVEN] Bumping versions
logStep "2) Bumping versions"
bash "$CURDIR/bump-for-release.sh" $RELEASE_VERSION
if [ ! $? -eq 0 ]
then
	logError "Bumping version has failed !" "Fix it"
	exit 1
fi


#### STEP 3 : [GIT] Creating a specific branch for release
BRANCH_FOR_RELEASE=$RELEASE_PREFIX$RELEASE_VERSION
logStep "3) Creating dedicated branch for RELEASE: \"$BRANCH_FOR_RELEASE\""
git checkout -b $BRANCH_FOR_RELEASE
if [ ! $? -eq 0 ]
then
	logError "Creating dedicated branch for release has failed !" "Fix it"
	exit 1
fi
sleep 2


#### STEP 4 : [MAVEN/SPEC] Call Release build specifics
logStep "4) Call Release build specifics"
bash "$CURDIR/release-build-specifics.sh"
if [ ! $? -eq 0 ]
then
	logError "Bumping version has failed !" "Fix it"
	exit 1
fi


#### STEP 5 : [GIT] Add and commit bumping version
# !! TODO !!


#### STEP 6 : [GIT] Push branch of release
# !! TODO !!


#### STEP 7 : [GITHUB/API] Do a Pull Request (release ==> master)
# !! TODO !!


#### STEP 8 : [GITHUB/API] Force Merge Pull Request
# !! TODO !!


#### STEP 9 :  [GITHUB/API] Draft a new release on MASTER / tag
# !! TODO !!


