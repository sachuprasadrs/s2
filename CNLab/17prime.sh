is_prime() {
  num=$1
  if [ "$num" -lt 2 ]
  then
    return 1
  fi
  for ((i = 2; i * i <= num; i++))
  do
    if (( num % i == 0 ))
    then
      return 1
    fi
  done
  return 0
}
read -p "Enter lower limit: " l
read -p "Enter upper limit: " u
echo "Prime numbers between $l and $u:"
for ((n = l; n <= u; n++))
do
  if is_prime "$n"
  then
    echo "$n"
  fi
done
