package create.prototype;

public class Retangle extends Shape {
	
	public Retangle() {
		type = "Retangle";
	}

	@Override
	void draw() {
		 System.out.println("Inside Rectangle::draw() method.");
	}

}
