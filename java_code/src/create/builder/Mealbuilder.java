package create.builder;

import create.builder.food_class.Chickenburger;
import create.builder.food_class.Coke;
import create.builder.food_class.Pepsi;
import create.builder.food_class.VegBurger;

public class Mealbuilder {
	
 	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
 	
 	
 	public Meal prepareNonVegMeal() {
 		Meal meal = new Meal();
 		meal.addItem(new Chickenburger());
 		meal.addItem(new Pepsi());
 		return meal;
 	}
}
