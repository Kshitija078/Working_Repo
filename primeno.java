!# /bin/bash

echo "enter a number to check prime or not"
read Num
if (($Num % 2==0))
then 
	echo " $Num is Primenumber"
else
	echo  "$Num is not primenumber"