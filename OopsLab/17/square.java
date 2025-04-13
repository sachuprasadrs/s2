package graphics;
public class square implements figure
{
	private double side;
	public square(double side)
	{
		this.side=side;
	}
	public double area()
	{
		return side*side;
	}
}
