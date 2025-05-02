class MultiplicationTable extends Thread {
	public void run() {
		System.out.println("Multiplication Table of 5:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + (5 * i));
			try {
				Thread.sleep(100); 
			} 
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class PrimeNumbers extends Thread {
	private int count;
	public PrimeNumbers(int count) {
		this.count = count;
	}
	public void run() {
		System.out.println("\nFirst " + count + " prime numbers:");
		int num = 2, found = 0;
		while (found < count) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				found++;
			}
			num++;
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println();
	}
	private boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
public class Thread1 {
	public static void main(String[] args) {
		MultiplicationTable tableThread = new MultiplicationTable();
		PrimeNumbers primeThread = new PrimeNumbers(10); 
		tableThread.start();
		primeThread.start();
	}
}
