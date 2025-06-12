echo "Enter the first file name"
read f1

echo "Enter the second file name"
read f2

if diff "$f1" "$f2" > /dev/null; then
  echo "same contents"
else
  echo "not same contents"
fi


: << 'END_COMMENT'

1. Start
2. Prompt for First File Name
Print "Enter the first file name".
Read user input and store it in variable f1.
3. Prompt for Second File Name
Print "Enter the second file name".
Read user input and store it in variable f2.
4. Compare File Contents
Use the diff command to compare the contents of f1 and f2.
If the diff command returns no differences:
Print "same contents".
Else:
Print "not same contents"
5. End

END_COMMENT
