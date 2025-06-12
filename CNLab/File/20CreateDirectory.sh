echo "Enter a directory:"
read dir1
if [ ! -d "$dir1" ]; then
  mkdir "$dir1"
  echo "Directory created"
else
  echo "Already exists"
fi
echo "Enter file name 1:"
read file1
touch "$dir1/$file1.txt"
echo "Enter file name 2:"
read file2
touch "$dir1/$file2.txt"
echo "Files created!"

:<<END_COMMENT

Aim: a shell script program to create a new directory and create two files.
Algorithm:
1. Start
2. Prompt for Directory Name Print "Enter a directory".
Read user input and store it in variable dir1.
3. Check if Directory Exists
If the directory specified by dir1 does not exist:
Create the directory.
Print "Directory created".
Else: Print "Already exists".
4. Prompt for First File Name
Print "Enter file name 1".
Read user input and store it in variable file1.
5. Create First File Create a text file named ${file1).txt in the directory ${dir1}.
6. Repeat the step 5:for f2
7. End

END_COMMENT
