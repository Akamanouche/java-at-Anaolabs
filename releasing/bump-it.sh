#!/bin/sh

# -----------------------------------------------------------------------------
# Version bumping shell 
# 
# This script aims to update version (from|to given ones) :
# - in main POM
# - in all children POM(s)
#
# Usage :
#	$ bash ./bump-it.sh -f <current version> -t <target version>
# -----------------------------------------------------------------------------

# Check parameters
while getopts "f:t:" opt; do
  case $opt in
    f)
		export CURRENT_VERSION=$OPTARG
		;;
    t)
		export TARGET_VERSION=$OPTARG
   	    ;;
	\?)
		echo "Value for option is mandatory ! ($OPTIND)"
		echo "usage : bash ./bump-it.sh -f <current version> -t <target version>"
		exit 1
		;;
  esac
done

echo "STARTING Bumping process..."


# Bump version in main POM
echo -e "\t- bumping version in main POM"
sed -i "s/<version>$CURRENT_VERSION<\/version>/<version>$RELEASE_VERSION<\/version>/g" pom.xml


# Bump version in all active modules POMs
for pom in $(mvn -B  exec:exec -Dexec.executable=echo -Dexec.args='${basedir}/pom.xml' | grep -v '\[')
do
	echo -e "\t- # bumping version in active module POM : ${pom}"
	sed -i "s/<version>$CURRENT_VERSION<\/version>/<version>$RELEASE_VERSION<\/version>/g" ${pom}
done


