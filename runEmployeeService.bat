:: @echo off
::if you want to run the next one after the last one is finished, you can use call
echo "Packaging EmployeeManagement ==============================="
call mvn clean package

echo "Starting EmployeeManagement ================================"
cd target
call java -jar EmployeeManagement-0.0.1-SNAPSHOT.jar