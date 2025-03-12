echo "Enter the first number: "
read a
echo "Enter the second number: "
read b
echo -e "Enter your choice \n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modulus\n6. Exponent"
read ch
case $ch in
1) echo "$a + $b = $((a + b))";;
2) echo "$a - $b = $((a - b))";;
3) echo "$a * $b = $((a * b))";;
4) 
if [ $b -ne 0 ];
then
echo "$a / $b = $((a / b))";
else
echo "Division by zero is not allowed.";
fi;;
5) echo "$a % $b = $((a % b))";;
6) echo "$a ^ $b = $(echo "$a ^ $b" | bc)";;
*) echo "Invalid Choice";;
esac
