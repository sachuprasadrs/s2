import java.util.*;
class Publisher {
	String pName;
	String aName;
	Publisher(String pName, String aName) {
		this.pName = pName;
		this.aName = aName;
	}
}
class Book extends Publisher {
	String bName;
	String author;
	int price;
	String type;
	Book(String pName, String aName, String bName, String author, int price, String type) {
		super(pName, aName);
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.type = type;
		}
}
class Literature extends Book {
	Literature(String pName, String aName, String bName, String author, int price, String type) {
		super(pName, aName, bName, author, price, type);
	}
	void display() {
		System.out.println("Publisher Name: " + pName);
		System.out.println("Author Name: " + aName);
		System.out.println("Book Name: " + bName);
		System.out.println("Author of the Book: " + author);
		System.out.println("Price of the Book: " + price);
		System.out.println("Type of the Book: " + type);
	}
}
class Fiction extends Book {
	Fiction(String pName, String aName, String bName, String author, int price, String type) {
		super(pName, aName, bName, author, price, type);
	}
	void displayF() {
		System.out.println("Publisher Name: " + pName);
		System.out.println("Author Name: " + aName);
		System.out.println("Book Name: " + bName);
		System.out.println("Author of the Book: " + author);
		System.out.println("Price of the Book: " + price);
		System.out.println("Type of the Book: " + type);
	}
}
class Category {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String pn, an, bn, a;
		int p, n1, n2;
		System.out.println("Enter the number of Literature books: ");
		n1 = sc.nextInt();
		Literature[] l = new Literature[n1];
		for (int i = 0; i < n1; i++) {
			System.out.print("\nEnter the publisher name: ");
			pn = s.nextLine();
			System.out.print("Enter the agency name: ");
			an = s.nextLine();
			System.out.print("Enter the name " + (i + 1) + " of book: ");
			bn = s.nextLine();
			System.out.print("Enter the author name: ");
			a = s.nextLine();
			System.out.print("Enter the price: ");
			p = sc.nextInt();
			l[i] = new Literature(pn, an, bn, a, p, "Literature");
		}
		System.out.println("\nEnter the number of Fiction books: ");
		n2 = sc.nextInt();
		Fiction[] f = new Fiction[n2]; 
		for (int i = 0; i < n2; i++) {
			System.out.print("\nEnter the publisher name: ");
			pn = s.nextLine();
			System.out.print("Enter the agency name: ");
			an = s.nextLine();
			System.out.print("Enter the name " + (i + 1) + " of book: ");
			bn = s.nextLine();
			System.out.print("Enter the author name: ");
			a = s.nextLine();
			System.out.print("Enter the price: ");
			p = sc.nextInt();
			f[i] = new Fiction(pn, an, bn, a, p, "Fiction");
		}
		System.out.println("\nLiterature book details are....\n");
		for (int i = 0; i < n1; i++) {
			l[i].display();
		}
		System.out.println("\nFiction book details are....\n");
		for (int i = 0; i < n2; i++) {
			f[i].displayF();
		}
		sc.close();
		s.close();
	}
}
