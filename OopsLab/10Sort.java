import java.util.*;

class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array");
        int n = sc.nextInt();

        String[] arr = new String[n];
        System.out.println("Enter " + n + " elements");
        sc.nextLine(); // consume the leftover newline

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("\nArray before sorting:");
        System.out.println(Arrays.toString(arr)); // prints like [a, b, c]

        // Sorting using compareTo
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(arr)); // prints like [a, b, c]

        sc.close(); // moved inside main method
    }
}
