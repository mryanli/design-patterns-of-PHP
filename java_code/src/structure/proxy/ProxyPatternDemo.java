package structure.proxy;


//这里是代理业务具体发生的地方
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");
		//第一次调用
		image.display();
		//第二次调用
		image.display();
	}
}

//这是图像接口，规定必须要执行一个显示方法
interface Image {
	void display();
}


//具体的图像类，他必须实现一个display方法
class RealImage implements Image {
	private String fileName;
	
	//在构造他时，就加载图像，可以保证只加载一次。
	public RealImage(String filename) {
		this.fileName = filename;
		loadFromDisk(filename);
	}

	@Override
	public void display() {
		System.out.println("displaying:" + fileName);
	}
	
	//私有化加载图像方法
	private void loadFromDisk(String fileName) {
		System.out.println("loading " + fileName);
	}
	
}




//这是代理类，同样实现了display方法。
//这个代理类，与RealImage 类是 聚合关系，即RealImage的声明周期有代理类控制
//另外可以把代理模式理解为只有两个节点的责任链模式
class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		//这个方法是代理类的灵魂，和责任链一样，不过责任链模式是在外部对每个节点
		//进行实例化，然后在具体业务中传递到另一个节点
		//代理模式是在调用节点的方法时，判断节点是否存在，不存在，就创建一个，并且保存起来
		//然后调用这个节点的方法
		if (realImage == null) {  //这个if判断，有单例模式的影子
			realImage = new RealImage(fileName);
		}
		realImage.display();
		System.out.println("-------------------");
	}
}