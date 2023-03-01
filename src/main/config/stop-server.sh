#!/bin/bash

if [ -f "server.pid" ];
then
   PID=$(cat "server.pid")
   echo "Stopping Server Process pid: $PID"
   kill "$PID"
   rm -rf server.pid
else
   echo "File server.pid does not exist - nothing to stop"
fi