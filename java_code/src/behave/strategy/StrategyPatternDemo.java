package behave.strategy;


//这是一个业务的具体发生过程

public class StrategyPatternDemo {

	//这里是整个业务的调用
	public static void main(String[] args) {
		//生成计算器
		Calculator calculator = new Calculator();
		//给计算器设置操作类，不同的操作类，实现了不同的计算方法，这个方法可以被计算器调用
		calculator.setOperation(new OperationSub());
		//计算器内部在进行计算操作时，实际是调用了传给他的操作类的计算方法，
		int result = calculator.ExecuteOperation(7, 1);
		
		System.out.println(result);
	}

}
