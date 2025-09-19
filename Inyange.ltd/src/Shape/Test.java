package Shape;

import java.util.Scanner;

public class Test {
public static void main(String[]args){
	Scanner STM=new Scanner(System.in);
	char choice;
	do{
		System.out.println("=====the shapes===");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("3.Square");
		System.out.println("4.Triangle");
		System.out.println("Select shapes");
		int choose=STM.nextInt();
		
		switch(choose){
		case 1:
			System.out.println("enter length");
			double l=STM.nextDouble();
			System.out.println("enter width");
			double w=STM.nextDouble();
			Rectangle mm=new Rectangle (l,w);
			System.out.println("what would u like to calculate");
			System.out.println("1.Area");
			System.out.println("2.Perimeter");
			System.out.println("your choose");
			int mom=STM.nextInt();
			if(mom==1){
				System.out.println("area of rectangle"+mm.calArea());
				
			}
			else if (mom==2){
				System.out.println("perimeter of rectangle:"+mm.calperimeter());
				
			}
			else{
				System.out.println("invalid selection(");
				
			}
			break;
		case 2:
			System.out.println("enter radius");
			double raa=STM.nextDouble();
			Circle hh=new Circle(raa);
			System.out.println("what would u like to calculate");
			System.out.println("1.Area");
			System.out.println("2.Perimeter");
			System.out.println("your choose");
			int mom2=STM.nextInt();
			if(mom2==1){
				System.out.println("area of rectangle:"+hh.calArea());
				
			}
			else if (mom2==2){
				System.out.println("perimeter of rectangle:"+hh.calperimeter());
				
			}
			else{
				System.out.println("invalid selection(");
				
			}
			break;
		case 3:
			System.out.println("enter the side");
			double dd=STM.nextDouble();
			
			Square sd=new Square(dd);
			
			System.out.println("what would u like to calculate");
			System.out.println("1.Area");
			System.out.println("2.Perimeter");
			System.out.println("your choose");
			
			int mom3=STM.nextInt();
			if(mom3==1){
				System.out.println("area of rectangle"+sd.calArea());
				
			}
			else if (mom3==2){
				System.out.println("perimeter of rectangle:"+sd.calperimeter());
				
			}
			else{
				System.out.println("invalid selection(");
				
			break;
			}
		case 4:
			System.out.println("enter the BASE");
			double bs=STM.nextDouble();
			System.out.println("enter the height");
			double ht=STM.nextDouble();
			Triangle jj=new Triangle(bs,ht);
			System.out.println("what would u like to calculate");
			System.out.println("1.Area");
			System.out.println("2.Perimeter");
			System.out.println("your choose");
			
			int mom4=STM.nextInt();
			if(mom4==1){
				System.out.println("area of rectangle"+jj.calArea());
				
			}
			else if (mom4==2){
				System.out.println("perimeter of rectangle:"+jj.calPerimeter());
				
			}
			else{
				System.out.println("invalid selection(");
			break;
			}
			default:
				System.out.println("invalid selection");
				break;
				
		
		}
	System.out.println("would you like to continue?(y/n");
	choice=STM.next().charAt(0);
	}
	
		while(choice=='y');
	
}
}