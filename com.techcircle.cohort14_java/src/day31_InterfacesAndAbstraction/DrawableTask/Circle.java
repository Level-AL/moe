package day31_InterfacesAndAbstraction.DrawableTask;

public class Circle implements Drawable  {

//Circle: 
//  - Make three instance variables of int x, int y, int radius)
//  - Create constructor method and initialize the variables
//  - Implement the draw method from the Drawable Interface(Print the message )
//  Print this message("Drawing a circle at (" + x +", " y + ") with radius " + radius)



	
	private int x;
	private int y;
	private int radius;
	
	public Circle (int x , int y , int radius) {
		 this.x = x;
		 this.y = y;
		 this.radius= radius;
		 
		
	}
	
	public void draw () {
		System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
	}
	
}

