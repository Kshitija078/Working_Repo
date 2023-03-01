!# /bin/bash

echo "enter a number to check even or odd"
read Num
if (($Num % 2==0))
then 
	echo " $Num is even number"
else
	echo  "$Num is odd number"