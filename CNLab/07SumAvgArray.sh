echo "Enter array size"
read n
declare -a a
echo "Enter the array elements"
for ((i=0;i<n;i++))
do
read a[$i]
done
echo "The array elements are :"
for ((i=0;i<n;i++))
do
echo ${a[i]}
done
s=0
for ((i=0;i<n;i++))
do
s=$((s+a[i]))
done
avg=$((s/n))
echo "Sum is: $s"
echo "Average is: $avg"
