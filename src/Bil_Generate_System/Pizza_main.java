package Bil_Generate_System;

public class Pizza_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pizza price = new Pizza(false);
		price.addExtrachese();
		price.addExtraToppings();
		price.TakeAway();
		price.Bil();*/
		
		deluxPizza pizza = new deluxPizza(true);
		pizza.addExtrachese();
		pizza.addExtraToppings();
		pizza.TakeAway();
		pizza.Bil();

	}
	

}

