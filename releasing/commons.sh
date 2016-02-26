#!/bin/sh

# -----------------------------------------------------------------------------
# Common functions
# -----------------------------------------------------------------------------

log() {
	echo "[RELEASING] $1"
}

logStep() {
	echo ""
	echo "[RELEASING] STEP $1"
}

logError() {
	echo "[ERROR] $1"
	if [ ! -z "$2" ]
	then
		echo "    ==> $2"
	fi


}


