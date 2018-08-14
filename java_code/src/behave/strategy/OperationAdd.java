package behave.strategy;

public class OperationAdd implements Operation {
	
	//具体的操作定义,这个类相当于是暴露给框架使用者，可以由框架使用者
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
