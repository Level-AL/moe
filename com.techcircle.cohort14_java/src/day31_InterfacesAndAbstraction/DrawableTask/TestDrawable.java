package day31_InterfacesAndAbstraction.DrawableTask;

public class TestDrawable {
	public static void main(String[] args) {
		Drawable [] shapes = new Drawable [2];
		
		shapes [0] = new Circle (10,20,30);
		shapes [1] = new Rectangle (50,60,70,80);
		
		for (Drawable shape : shapes) {
			shape.draw();
		}
	}
}
