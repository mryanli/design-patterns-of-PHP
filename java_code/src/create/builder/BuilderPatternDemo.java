package create.builder;

public class BuilderPatternDemo {
	
	
	public static void main(String[] args) {
		Mealbuilder mealbuilder = new Mealbuilder();
		Meal vegMeal= mealbuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost:" + vegMeal.getCost());
		
		
		Meal nonVegMeal = mealbuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost:"+ nonVegMeal.getCost());
			
	}

}
