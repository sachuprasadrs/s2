import java.util.*;
class Complex
{
	int r,i;
	Complex(int r,int i)
	{
		this.r=r;
		this.i=i;
	}
	void sum(Complex c1,Complex c2)
	{
		int x=c1.r+c2.r;
		int y=c1.i+c2.i;
		System.out.println("sum of "+x+"+"+y+"i");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first complexs no (as real imginary)");
		int r1=sc.nextInt();
		int i1=sc.nextInt();
		Complex c1=new Complex(r1,i1);
		System.out.println("enter second complexs no (as real imginary)");
		int r2=sc.nextInt();
		int i2=sc.nextInt();
		Complex c2=new Complex(r2,i2);
		Complex c3=new Complex(0,0);
		c3.sum(c1,c2);
	}
}
