echo "Enter a Binary number :"
read binary
decimal=0
i=0
while [ $binary -ne 0 ]
do
	rem=$((binary%10))
	decimal=$((decimal + rem * 2 ** i))
	i=$((i+1))
	binary=$((binary/10))
done
echo "Decimal equivalent is: $decimal"
