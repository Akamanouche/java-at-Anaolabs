#!/bin/sh

# -----------------------------------------------------------------------------
# Version bumping shell for a given release
# 
# This script aims to :
# 1) check coherence of release
# 2) then calls external script for bumping POM(s)
# 3) then does specific update
#
# Usage :
#	$ bash ./bump-for-release.sh <current version>
# -----------------------------------------------------------------------------

# Check parameters
if [ $# -eq 0 ]
then
	echo "[ERROR] Missing targeted \"version\" !..."
    echo "    ==> usage: bash /path/to/bump-for-release.sh <version>"
    exit 1
fi 
export RELEASE_VERSION=$1

echo "DOING checks for new release : $RELEASE_VERSION"

# 1) Extract CURRENT VERSION in main POM
export CURRENT_VERSION=`mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | sed -n -e '/^\[.*\]/ !{ /^[0-9]/ { p; q } }'`
if [ $CURRENT_VERSION == "1" ]
then
	echo "Current directory is not a maven project"
	exit 1
fi

echo -e "\t- Current version is : $CURRENT_VERSION"

# [RULE 1] version MUST ends with "-SNAPSHOT" as we release ONLY FROM "develop" branch
if [[ ! "$CURRENT_VERSION" == *SNAPSHOT ]]
then
	echo "Current version SHOULD BE a 'SNAPSHOT' version !"
	exit 1
fi

# [MORE CHECK / TODO ] No other "SNAPSHOT" mention in main POM ?


echo -e "\t- checks: OK !"
CURDIR=`dirname $0`

# Call Bumping process
bash $CURDIR/bump-it.sh -f $CURRENT_VERSION -t $RELEASE_VERSION

# Call POST Bumping specific process
bash $CURDIR/post-bump-specs.sh -f $CURRENT_VERSION -t $RELEASE_VERSION


