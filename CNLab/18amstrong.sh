armstrong() {
num=$1
sum=0
temp=$num
digits=${#num}
while [ $temp -gt 0 ]; do
digit=$((temp%10))
sum=$((sum + digit**digits))
temp=$((temp/10))
done
if [ $sum -eq $num ]; then
echo "$num is an armstrong number"
else
echo "$num is not an armstrong number"
fi
}
read -p "Enter a number " n
armstrong $n
