LOG_FILE=server.log

echo "Starting Server" > $LOG_FILE

echo "> mvn exec:java -Dexec.mainClass=$1" >> $LOG_FILE
mvn exec:java -Dexec.mainClass="$1" >> $LOG_FILE 2>>$LOG_FILE &
echo "System process started" >> $LOG_FILE
echo $! > server.pid

echo "> Waiting for the server to bind port 4567."

while ! nc -z localhost 4567; do
  sleep 0.1
done

echo "> Server Started"