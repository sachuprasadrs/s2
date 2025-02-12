import java.util.*;
class Product
{
	int p_code;
	String p_name;
	int price;
}
public class Demo
{
	public static void main(String args[])
	{
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first product  code : ");
		p1.p_code = sc.nextInt();

		System.out.println("Enter first product  price : ");
		p1.price = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter  first product  name : ");
		p1.p_name = sc.nextLine();

		System.out.println("Enter second product  code : ");
		p2.p_code = sc.nextInt();

		System.out.println("Enter second product  price : ");
		p2.price = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter second product  name : ");
		p2.p_name = sc.nextLine();

		System.out.println("Enter third product code : ");
		p3.p_code = sc.nextInt();

		System.out.println("Enter third product price : ");
		p3.price = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter third product name : ");
		p3.p_name = sc.nextLine();
		
		System.out.println("......Product having the lowest price....");
		if(p1.price < p2.price && p1.price < p3.price)
		{
			System.out.println("Product name : " + p1.p_name);
			System.out.println("Product code : " + p1.p_code);
			System.out.println("Product price : " + p1.price);
		}
		else if(p2.price < p3.price)
		{
			System.out.println("Product name : " + p2.p_name);
			System.out.println("Product code : " + p2.p_code);
			System.out.println("Product price : " + p2.price);
		}
		else
		{
			System.out.println("Product name : " + p3.p_name);
			System.out.println("Product code : " + p3.p_code);
			System.out.println("Product price : " + p3.price);
		}
	}
}
