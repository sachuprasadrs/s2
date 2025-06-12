while true
  do
  read -p $'1. User details\n2. Current user\n3. Present working directory\n4. Date\nEnter your choice: ' ch
  case "$ch" in
    1) who
    ;;
  2) whoami
    ;;
  3) pwd
    ;;
  4) date
    ;;
  *) echo "Invalid choice"
    ;;
  esac
done

: << 'END_COMMENT'

Write a shell script program that list user details, current user, present working
directory and date.
Algorithm:
1. Display Options
Display the message: "1. User details 2. Current user
3. Present working directory 4. Date"
Display the message: "Enter your choice"
2. Read User Choice
Read the user input into a variable ch
3. Execute Command Based on User Choice
Use a case statement to match the user's choice (ch)
If ch is 1, execute who to display user details
If ch is 2, execute whoami to display the current user
If ch is 3, execute pwd to display the present working directory
If ch is 4, execute date to display the current date and time
If ch does not match any of the above, display "Invalid choice"

END_COMMENT
