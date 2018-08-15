package create.builder.food_class;

import create.builder.food_abstract_class.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		
		return 30.0f;
	}

}
