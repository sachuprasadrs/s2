package graphics;
public class circle implements figure
{
  private double radius;
	public circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
}
