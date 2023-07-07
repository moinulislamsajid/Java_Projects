package Bil_Generate_System;

public class deluxPizza extends Pizza{

	public deluxPizza(boolean veg) {
		super(veg);
		super.addExtrachese();
		super.addExtraToppings();
		super.TakeAway();
	}
}
