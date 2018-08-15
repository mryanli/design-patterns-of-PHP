package create.builder.food_class;

import create.builder.food_abstract_class.Burger;

public class Chickenburger extends Burger {

	@Override
	public String name() {
		
		return "chicken Burger";
	}

	@Override
	public float price() {
		
		return 50.5f;
	}

}
