echo "Enter the filename:"
read f1
if [ -f "$f1" ]; then
  echo "Enter the string:"
  read st1
  grep -v "$st1" "$f1"
else
  echo "File not found"
fi

: << 'END_COMMENT'

To display all lines in a file that does not contains in the string ‘abc’.
Algorithm:
1. Prompt User for Filename
Display the message: "Enter the filename"
Read the user input into a variable fl
2. Check if File Exists
the file specified by fl exists:
Proceed to the next step
Else:
Display the message: "File not found"
Terminate the script
3. Prompt User for Search String
Display the message: "Enter the string"
Read the user input into a variable stl
4. Search for Lines Not Containing the String in the File
Use the grep -v command to search for lines that do not contain the string stl
in the file fl
Display the matching lines from the file

END_COMMENT
