#!/bin/bash

LOG_DIR="$(pwd)"/logs
LOG_FILE="${LOG_DIR}"/nohup.out

cd website
nohup python3 -m http.server 80 >> "${LOG_FILE}" &
