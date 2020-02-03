:: @echo off
::if you want to run the next one after the last one is finished, you can use call
echo "EmployeeManagement ==============================="
set p=%cd%

cd EmployeeManagement
start runEmployeeService.bat

cd ..\vueJs
start runVueJS.bat

