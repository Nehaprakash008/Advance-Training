package ProblemStatement;

public class Rectangle {
	 private int length;
	private int breadth;
	
	public Rectangle()
	{
		length =0;
		breadth =0;
	}
	 
	public Rectangle(int length, int breadth)
	{
		this.length =length;
		this.breadth = breadth;
	}
	
	public int area()
	{
		 int area = length * breadth;
		// System.out.println("Area="+ area);
		return area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}

	

	

