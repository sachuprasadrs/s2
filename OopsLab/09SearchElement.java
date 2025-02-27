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
