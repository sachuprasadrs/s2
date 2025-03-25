echo "Enter a no:"
read n
t=$n
rev=0
while [ $n -ne 0 ];
do
rem=$(($n % 10))
rev=$((rev*10+rem))
n=$((n/10))
done
if [ $rev -eq $t ]
then
echo "$t is Paliandrome"
else
echo "$t is not Paliandrome"
fi
