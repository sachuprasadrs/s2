package mca;
import graphics.*;
import java.util.*;
public class testgraphics
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the rectangle:");
		double length=sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle:");
		double breadth=sc.nextDouble();
		rectangle rect = new rectangle(length, breadth);
		System.out.println("Area of Rectangle: " + rect.area());
		System.out.println("\n");
		
		System.out.print("Enter base of the triangle: ");
		double base=sc.nextDouble();
		System.out.print("Enter height of the triangle: ");
		double height=sc.nextDouble();
		triangle tri=new triangle(base,height);
		System.out.println("Area of Triangle:"+tri.area());
		System.out.println("\n");
		
		System.out.print("Enter the side of the square:");
		double side=sc.nextDouble();
		square squ=new square(side);
		System.out.println("Area of Square:"+squ.area());
		System.out.println("\n");
		
		System.out.print("Enter the radius of the circle:");
		double radius=sc.nextDouble();
		circle cir=new circle(radius);
		System.out.println("Area of Circle:"+cir.area());
		System.out.println("\n");
	}
}
