import java.util.*;
class string {
	public static void main(String[] args) {
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		a=sc.nextLine();
		System.out.println("Enter second string");
		b=sc.nextLine();
		System.out.print("Lowercase of first string:");
		System.out.println(a.toLowerCase());
		System.out.print("Uppercase of first string:");
		System.out.println(a.toUpperCase());
		System.out.print("Substring:");
		System.out.println(a.substring(0,5));
		System.out.print("Length of the first string:");
		System.out.println(a.length());
		System.out.print("Concatenate of two strings:");
		System.out.println(a.concat(b));
	}
}
