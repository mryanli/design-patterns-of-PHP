package behave.chain;

public class ChainPatternDemo {

	// 具体的业务代码，生成责任链
	private static AbstractLogger getChainOfLoggers() {

		// 生成链表节点
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		// 链接链表
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		// 返回的是链表的头部
		return errorLogger;
	}

	public static void main(String[] args) {
		// 获得链表的头部
		AbstractLogger loggerChain = getChainOfLoggers();

		// 调用头部的的logMseeage方法
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}

abstract class AbstractLogger {
	// 定义三个常量，每一个继承者都能通过类名.常量名来获取到常量值。
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	// 为每个连节点定义一个成员变量，用来保存下个节点对象的引用，可以理解为指针
	protected AbstractLogger nextLogger;

	// 为每个节点设置下一个节点，相当于链表里将每个节点串联起来
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		// 当从头部开始记录错误日志时，对错误级别进行判断，错误级别是否比自己默认级别高，如果高，
		// 则，打印日志，如果低，则不打印。
		if (this.level <= level) {
			write(message);
		}
		// 如果链条后面还有节点，就将最初的错误日志和消息传递给下一个节点来处理完，直到没有后续节点为止。
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		} else {
			// 每次链条调用结束后写分割线
			System.out.println("-----------------------------------");

		}
	}

	// 定义自己处理日志的方式，每个具体的节点对象都必须实现该方法
	abstract protected void write(String message);

}

// 定义一个console面板日志
class ConsoleLogger extends AbstractLogger {
	// 每个节点在构造时都会有个自己的默认级别，高于这个默认级别，才会做具体的日志处理，否则
	// 不做任何处理，然后调用链上的下一个节点
	public ConsoleLogger(int level) {
		this.level = level;
	}

	// 定义自己的错误处理程序
	@Override
	protected void write(String message) {
		System.out.println("console::logger" + message);
	}
}

// 定义一个错误日志
class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	// 定义自己的错误处理程序
	@Override
	protected void write(String message) {
		System.out.println("Error::Logger: " + message);
	}
}

// 定义一个文件日志
class FileLogger extends AbstractLogger {
	public FileLogger(int level) {
		this.level = level;
	}

	// 定义自己的错误处理程序
	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
