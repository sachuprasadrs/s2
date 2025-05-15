is_prime() {
  [ $1 -le 1 ] && return 1
  for ((i=2; i*i<=$1; i++)); do
    [ $(( $1 % i )) -eq 0 ] && return 1
  done
  return 0
}

read -p "Enter lower limit: " l
read -p "Enter upper limit: " u
echo "Primes between $l and $u:"
for ((n=l; n<=u; n++)); do
  is_prime $n && echo $n
done
