package Shape;

public class Rectangle{

	private double L;
	private double w;
	public Rectangle(double l, double w) {
		super();
		L = l;
		this.w = w;
	}
public double calArea(){
	return this.L*this.w;
}
public double calperimeter(){
	return this.L+this.w;
	
}
}
