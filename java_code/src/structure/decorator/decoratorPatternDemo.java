package structure.decorator;

import structure.decorator.decorator.RedShapeDecorator;
import structure.decorator.shape.Circle;
import structure.decorator.shape.Rectangle;
import structure.decorator.shape.Shape;

public class decoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		circle.draw();
		
		redCircle.draw();
		
		
		
		
		

	}

}
