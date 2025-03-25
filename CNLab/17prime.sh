is_prime() {
    num=$1
    if [ $num -le 1 ]
    then
        return 1 
    fi
    for((i=2;i<=num/2;i++))
    do
        if [ $((num % i)) -eq 0 ]
        then
            return 1 
        fi
    done
    return 0  
}
find_prime() 
{
    lower=$1
    upper=$2
    echo "Prime numbers between $lower and $upper:"
    for (( num=$lower; num<=$upper; num++ ))
    do
        if is_prime $num
        then
            echo $num
        fi
    done
}
read -p "Enter the lower limit: " lower_limit
read -p "Enter the upper limit: " upper_limit
find_prime $lower_limit $upper_limit
