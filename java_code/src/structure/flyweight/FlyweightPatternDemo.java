package structure.flyweight;

public class FlyweightPatternDemo {
	
	private static final String colors[]= {"red","green","blue","white","black"	};
	

	public static void main(String[] args) {
		for (int i = 0; i < 20;++i) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setRadius(getRandomX());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.draw();
			
		}
	}
	
	public static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}

}
