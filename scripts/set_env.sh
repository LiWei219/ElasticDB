#!/bin/bash

set -o allexport

MYSQL_USERNAME='root'
MYSQL_PASSWORD='TigerBit!2016'

# HOSTS
#writeQueue = 35.162.86.105
#readQueue = 35.162.86.105,54.204.168.204,35.161.215.21
#candidateQueue = 35.164.142.220

MASTER=35.165.242.238
SLAVE=(35.164.41.187 35.165.250.16)
CANDIDATE=(35.166.55.239)


# Directories from which files are copied
WORKING_HOME=/tmp

set +o allexport

