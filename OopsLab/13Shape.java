import java.util.*;
class areas{
	void area(int l, int b){
		int rec=l*b;
		System.out.println("Area of Rectangle is: " +rec);
	}
	void area(float r){
		System.out.println("Area of circle is: " +3.14*r*r);
	}
	void area(int s){
		int sq=s*s;
		System.out.println("Area of Square is: "+sq);
	}
}
class Shape{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("The Shapes under implementation (1.Square 2.Circle 3.Rectangle)");
		System.out.println("Enter the side length of Square: ");
		int s= sc.nextInt();
		areas a1 = new areas();
		a1.area(s);
		System.out.println("Enter the radius of Circle: ");
		float r=sc.nextInt();
		a1.area(r);
		System.out.println("Enter the length and breadth of Rectangle :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		a1.area(l,b);
	}
}
