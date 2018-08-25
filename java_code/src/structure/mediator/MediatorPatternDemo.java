package structure.mediator;

import java.util.Date;


public class MediatorPatternDemo {
	
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("john"); //实体
		
		robert.sendMessage("hi,john");//实体发消息，方法内部封装了中介者，即将中介者隐藏了。
		john.sendMessage("hi,robert");
		
	}

}

//聊天室为中介者
class ChatRoom{
	
	public static void showMessage(User user,String message) {
		System.out.println((new Date()).toString() + "["+user.name+"]"+message);
	}
}


//实体类的父类，他的的不同实例之间通过中介者来通信。
//实例中向向中介发消息时，是直接用中介者的静态方法来接收消息的。
class User{
	
	String name;
			
	public User(String name) {
		this.name = name;
	}
	
	public void sendMessage(String message) {   //senMessage方法是向中介发消息
		ChatRoom.showMessage(this, message);    //这里，中介者一定要接收发消息者的一个实体，this，并在中介者内部去
												//对发消息的实体进行处理，本例中，向屏幕打印消息即为通知各个
												//实体，实际中介还可以将不同的实体保存到一个列表里，通过遍历的方式
												//回调实体的方法，达到实体间通信的目的。
	}
}


