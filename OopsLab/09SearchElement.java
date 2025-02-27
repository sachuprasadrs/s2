import java.util.*;

class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " elements:");
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.print("Enter element to search: ");
		String key = sc.nextLine();
		int position = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i].equals(key)) {
				position = i;
				break;
			}
		}
		if (position != -1) {
			System.out.println("Element \"" + key + "\" found at index " + position);
		} else {
			System.out.println("Element \"" + key + "\" not found");
		}
		sc.close();
	}
}
/*
1. Input the size of the array:

    Prompt the user to input the number of elements n that will be in the array.
    Read the integer value n from the user.

2. Declare and initialize the array:

    Declare an array arr of strings with size n.
    Prepare to store the elements of the array entered by the user.

3. Input the array elements:

    Print a message prompting the user to enter n elements.
    For each index i from 0 to n-1, prompt the user to input a string and store it in arr[i].

4. Input the element to search:

    Print a message asking the user to enter the element they want to search for.
    Read the search element (key) from the user.

5. Search for the element:

    Initialize a variable position to -1 (indicating the element is not found by default).
    Loop through the array, checking each element:
        If the current element equals the search key (using .equals()), update the position to the index i and break out of the loop.

6. Check if the element was found:

    If position is not -1, print a message indicating that the element was found at the index position.
    If position is still -1, print a message indicating that the element was not found in the array.

7. Close the scanner:

    Close the Scanner object to free up resources after the input operation is complete.*/
