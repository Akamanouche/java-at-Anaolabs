#!/bin/sh

# -----------------------------------------------------------------------------
# Project specifics POST-Bumping actions
# 
# This script aims to do specifics action after bumping
# 
# THIS SCRIPT is PROJECT-SPECIFIC : you have to CUSTOMIZE it if necessary !
#
#
# Usage :
#	$ bash ./post-bump-specifics.sh -f <current version> -t <target version>
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
		echo "usage : bash ./post-bump-specs.sh -f <current version> -t <target version>"
		exit 1
		;;
  esac
done

echo "STARTING POST-Bumping specific process..."


# HERE starts the so called PROJECT-SPECIFIC stuff...

# Bump version in all active modules POMs
for props in $(ls infra/*.properties)
do
	echo -e "\t- specific updates in property file : ${props}"
	sed -i "s/dwh.version=.*/dwh.version=$RELEASE_VERSION/g" ${props}
done


