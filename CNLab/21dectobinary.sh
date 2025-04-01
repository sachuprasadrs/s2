echo "Enter a decimal number :"
read decimal
binary=0
i=1
while [ $decimal -ne 0 ]
do
	rem=$((decimal%2))
	decimal=$((decimal/2))
	binary=$((binary + rem * i))
	i=$((i*10))
done
echo "Binary equivalent is: $binary"
