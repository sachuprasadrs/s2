package graphics;

public class rectangle implements figure
{
	private double length;
	private double breadth;
	public rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		return length*breadth;
	}
}
