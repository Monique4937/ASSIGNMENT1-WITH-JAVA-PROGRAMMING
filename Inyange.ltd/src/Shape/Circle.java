package Shape;

public class Circle {
private double rad;

public Circle(double rad) {
	super();
	this.rad = rad;
}
public double calArea(){
return Math.PI*rad*rad;
}
public double calperimeter(){
return 2*Math.PI*rad;
	
}
}
