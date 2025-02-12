import java.util.Scanner;

class Product {
	int p;
	String pname;
	double price;

	Product(int p, String pname, double price) {
		this.p = p;
		this.pname = pname;
		this.price = price;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Product products[] = new Product[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter product ID for product " + (i + 1) + ": ");
			int p = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter product name for product " + (i + 1) + ": ");
			String pname = scanner.nextLine();
			System.out.print("Enter price for product " + (i + 1) + ": ");
			double price = scanner.nextDouble();
			products[i] = new Product(p, pname, price);
		}

		Product lowestPriceProduct = products[0];
		for (Product prod : products) {
			if (prod.price < lowestPriceProduct.price) {
				lowestPriceProduct = prod;
			}
		}

		System.out.println("Product with lowest price, "+lowestPriceProduct.price+" is:"+lowestPriceProduct.pname);
		scanner.close();
	}
}
