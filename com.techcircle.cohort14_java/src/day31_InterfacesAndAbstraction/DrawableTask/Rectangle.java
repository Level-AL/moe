package day31_InterfacesAndAbstraction.DrawableTask;
//Rectangle: 
//- Make three instance variables of int x, int y, int width, int hidth)
//- Create constructor method and initialize the variables
//- Implement the draw method from the Drawable Interface
//Print this message("Drawing a rectangle at (" + x +", " + y + ") with width " + width + "and height " + height  )

public class Rectangle implements Drawable {

	int x;
	int y;
	int width;
	int height;
	
	public Rectangle (int x, int y, int width, int height) {
		this.height= height;
		this.width = width;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with width " + width + "and height " + height );
	}
	
	
	
	
}
