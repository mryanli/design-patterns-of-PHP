package structure.flyweight;

import java.util.HashMap;

public class FlyweightPatternDemo {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}

//必须实现画这个方法
interface Shape {
	void draw();
}


//实现形状接口，并给自己定义了一些属性，把设置属性的方法暴露出去
class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int radius;

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}

	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}


//定义形状工厂， 工厂里有一个hash列表，
class ShapeFactory {
	//定义hash列表，用字符串做键，用形状做值
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		//以颜色为键，获取形状
		Circle circle = (Circle) circleMap.get(color);
		
		//返回形状，如果形状没有，就实例化一个，并存入hash表，这里也用到了单例模式
		//if判断是享元模式的关键代码，所谓享元，即共同分享同一个单元。
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}