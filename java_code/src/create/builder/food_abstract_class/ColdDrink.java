package create.builder.food_abstract_class;

import create.builder.packing_class.Bottle;
import create.builder.top_interface.Item;
import create.builder.top_interface.Packing;

public abstract class ColdDrink implements Item {

	
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
