echo "Enter a Binary number :"
read Binary
decimal=0
i=0
while [ $Binary -ne 0 ]
do
	rem=$((Binary%2))
	decimal=$((decimal*rem*2**i))
	
	i=$((i+1))
 binary=$((Binary/10))
done
echo "Decimal equivalent is: $decimal"
