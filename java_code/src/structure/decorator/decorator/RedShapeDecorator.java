package structure.decorator.decorator;

import structure.decorator.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("border color:red");
	}

}
