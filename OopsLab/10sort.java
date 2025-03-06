import java.util.*;
class sort
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter "+n+" elements");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		System.out.println("\n Array before sorting");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n Array after sorting:");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
  sc.close();
}
