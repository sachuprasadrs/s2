echo "Enter a no:"
read n
rev()
{
org_n=$1
rev=0
while [ $org_n -ne 0 ];
do
rem=$(($org_n % 10))
rev=$((rev*10+rem))
org_n=$((org_n/10))
done
echo "Reverse of $1 is : $rev"
}
rev $n
