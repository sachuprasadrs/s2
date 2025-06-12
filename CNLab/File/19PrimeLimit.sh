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

:<< END_COMMENT

1. Input: Prompt the user to enter the lower and upper limits of the range.
2. Initialize Variables:
I for the lower limit.
u for the upper limit.
3. Prime Checking Function:
Define a function is_prime to check if a number is prime:
If the number is less than 2, it is not prime.
Loop from 2 to the square root of the number (inclusive):
If the number is divisible by any of these values, it is not prime.
If no divisors are found, the number is prime.
4. Iterate Over the Range:
Loop from I to u (inclusive):
Use the is_prime function to check if the current number is prime.
If the number is prime, print it.
5. Output: Display the prime numbers within the range

END_COMMENT
