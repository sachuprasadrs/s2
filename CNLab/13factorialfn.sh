factorial()
{
fact=1
for((i=2;i<=n;i++))
do
fact=$((fact*i))
done
echo $fact
}
echo "Enter a number"
read n
factorial
