package Shape;

public class Triangle {
	private double b;
	private double h;
	private double hy;
	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
		double result=(b*b)+(h*h);
		this.hy=Math.sqrt(result);
		
	}
	public double calArea(){
		return (this.b*this.h)/2;}
	
		public double calPerimeter(){
			return this.b*this.h+this.hy;
		
		
	}
	
}
