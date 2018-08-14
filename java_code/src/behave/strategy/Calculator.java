package behave.strategy;

public class Calculator {
	
	
	//私有化一个变量，用来保存外界传递进来的操作对象，该对象封装了操作方法
	private Operation operation;
	
	
	//该方法暴露（public）给业务处理类，以便业务处理类设置不同的操作实例	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	//该方法暴露给业务处理类，以便业务处理类实施操作，其实内部调用的还是操作对象定义的具体操作方法
	public int ExecuteOperation(int num1,int num2) {
		return this.operation.doOperation(num1, num2);
	}
	

}



