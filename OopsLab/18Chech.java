import java.util.Scanner;
class EvenException extends Exception {
	EvenException(String s) {
		super(s);
	}
}
class OddException extends Exception {
	OddException(String s) {
		super(s);
	}
}
class Check {
	static void evenorodd(int n) throws EvenException, OddException {
		if (n % 2 == 0) {
			throw new EvenException("Even number");
		}
		else {
			throw new OddException("Odd number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		try {
			evenorodd(n);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
