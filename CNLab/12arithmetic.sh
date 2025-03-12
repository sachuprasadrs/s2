echo "Enter the first number: "
read a
echo "Enter the second number: "
read b
echo -e "Enter your choice \n1.Add\n2.Subtract\n3.Multiply\n4.Divide"
read ch 
case $ch in
1) echo "$a + $b = $((a+b))";;
2) echo "$a - $b = $((a-b))";;
3) echo "$a * $b = $((a*b))";;
4) echo "$a / $b = $((a/b))";;
*) echo "Invalid Choice";;
esac
