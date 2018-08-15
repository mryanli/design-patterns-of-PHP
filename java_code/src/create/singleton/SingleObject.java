package create.singleton;

public class SingleObject {
	
	//声明一个私有化的类变量，来保存 唯一 的 实例
	private static SingleObject instance = new SingleObject();
	
	//让构造函数未Private，这样，该类就不会被实例化
	private SingleObject () {}
	
	//获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance; 
	}
	
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
	

}
