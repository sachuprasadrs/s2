echo "Enter a name:"
read n
if [ -d "$n" ]; then
  echo "This is a directory"
elif [ -f "$n" ]; then
  echo "This is a file"
else
  echo "Something else"
fi


: << 'END_COMMENT'
Aim:Write a shell script command like argument and find whether it is a directory, a file or
something else.
Algorithm:
1. Start
2. Prompt for Name
Print "Enter a name:".
Read user input and store it in variable n.
3. Check if Name is a Directory
If the name n corresponds to a directory:
Print "This is a directory".
4. Check if Name is a File
Else if the name n corresponds to a file:
Print "This is a file".
5. Handle Other Cases Else:
Print "Something else".
6. End
Program:
echo "enter a name:"
read n
if [ -d $n ]
then
echo "this is a directory"
elif [ -f $n ]
then
echo "this is a file"
else
echo "something else"
fiAim:Write a shell script command like argument and find whether it is a directory, a file or
something else.
Algorithm:
1. Start
2. Prompt for Name
Print "Enter a name:".
Read user input and store it in variable n.
3. Check if Name is a Directory
If the name n corresponds to a directory:
Print "This is a directory".
4. Check if Name is a File
Else if the name n corresponds to a file:
Print "This is a file".
5. Handle Other Cases Else:
Print "Something else".
6. End
END_COMMENT
