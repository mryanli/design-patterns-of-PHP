package create.builder.food_class;

import create.builder.food_abstract_class.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		
		return "Pepsi";
	}

	@Override
	public float price() {
		
		return 35.0f;
	}

}
