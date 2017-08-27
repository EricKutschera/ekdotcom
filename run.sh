#!/bin/bash

lein uberjar
cd target/uberjar
sudo -E nohup java -jar ekdotcom.jar &
