#!/bin/sh
service ssh start
# HELLO WORLD
apt-get install -y python3
python3 -m http.server 80
