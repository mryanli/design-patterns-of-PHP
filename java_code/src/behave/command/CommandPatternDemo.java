package behave.command;

import java.util.ArrayList;
import java.util.List;



public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		//buyOrder对象构造时，会保存股票操作员的实例，
		//注意，这里两个命令对象，都是保存同一个股票操作员的实例。
		//不同的命令，会调用操作员不同的方法，
		//命令，将这些操作方法都封装在同一个统一的接口中方法execute中
		BuyOrder buyOrder = new BuyOrder(abcStock);
		SellOrder sellOrder = new SellOrder(abcStock);

		Broker broker = new Broker();
		
		//broker对象在构造时，会拿到buyorder对象的实例，通过调用buyorder的方法，可以调用股票操作员的方法
		
		broker.takeOrder(buyOrder);
		broker.takeOrder(sellOrder);

		broker.placeOrders();
	}

}

// 这是一个命令接口，实现他就要实现他的接口
interface Order {
	void execute();
}


//股票操作员，拥有买和卖两个行为
class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void buy() {
		System.out.println("stock [ name :" + name + ", quantity :" + quantity + "] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}


//购买命令，他实现了命令接口，同时拥有一个股票操作员
class BuyOrder implements Order {
	
	private Stock abcStock;

	public BuyOrder(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}

}


//出售命令，实现了命令接口，同时拥有一个股票操作员
class SellOrder implements Order {
	private Stock abcStock;

	public SellOrder(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}


//定义一个交易所
class Broker {
	
	//命令清单
	private List<Order> orderList = new ArrayList<Order>();
	
	//添加命令
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	//执行命令，完事后将列表清空
	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
