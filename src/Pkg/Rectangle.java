package Pkg;

public class Rectangle {

	double length;
	double width;

	
	public Rectangle()
	{
		
	}
	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}
	
	public double calculateArea(double l,double w)
	{
		double area=l*w;
		System.out.println("Area of rectangle is "+area);
		return area;
	}
	
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(12.0,20.0);
		r.calculateArea(10.0,20.0);
		
		//System.out.println(r.calculateArea(10.0, 20.0));
		
	}

}
