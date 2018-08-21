package structure.facade;


import structure.facade.shape.Circle;
import structure.facade.shape.Rectangle;
import structure.facade.shape.Shape;
import structure.facade.shape.Square;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle =  new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
		
	}
}
