package behave.strategy;


//一个操作的接口，内部只定义了操作的方法，这个方法必须由实现类具体定义，以便方法的调用方执行。
public interface Operation {
	public int doOperation(int num1,int num2);
}
