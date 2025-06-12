echo "Enter the lower limit: "
read l
echo "Enter the upper limit: "
read u
echo "The prime numbers are:"
prime() {
  for (( i = l; i <= u; i++ )); do
    flag=0
    for (( j = 2; j <= i / 2; j++ )); do
      if (( i % j == 0 )); then
        flag=1
        break
      fi
    done
    if [ $flag -eq 0 ] && [ $i -gt 1 ]; then
      echo "$i"
    fi
  done
}
prime

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
