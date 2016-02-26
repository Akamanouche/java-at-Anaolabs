#!/bin/sh

# -----------------------------------------------------------------------------
# Release build specifics
# 
# This script aims to :
# 1) Build in DEV mode (with tests)
# 2) Build in PROD mode (generates PROD binaries)
#
# -----------------------------------------------------------------------------

# Constants
CURDIR=`dirname $0`

# source commons
source "$CURDIR/commons.sh" 

# [MAVEN] Launch a DEV build
log "BUILDING in DEV Mode (with Tests)"
mvn clean install -P DEV
if [ ! $? -eq 0 ]
then
	exit 1
fi


# [MAVEN] Launch a PROD build
log "BUILDING PROD binaries"
mvn clean install -P PROD
if [ ! $? -eq 0 ]
then
	exit 1
fi


