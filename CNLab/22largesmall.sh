echo "Enter array size"
read n
declare -a a
echo "Enter the elements"
for((i=0;i<n;i++))
do
read a[$i]
done
largest=${a[0]}
smallest=${a[0]}
for((i=1;i<n;i++))
do
if [ ${a[i]} -gt $largest ]
then
largest=${a[i]}
elif [ ${a[i]} -lt $smallest ]
then
smallest=${a[i]}
fi
done
echo "The largest element is: $largest"
echo "The smallest element is: $smallest"
