package create.builder.food_abstract_class;

import create.builder.packing_class.Wrapper;
import create.builder.top_interface.Item;
import create.builder.top_interface.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
