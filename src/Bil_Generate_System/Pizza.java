package Bil_Generate_System;

public class Pizza {
	
	private int price;
	private Boolean veg;
	private int extraChese_price = 100;
	private int extraTopping_price = 150;
	private int Backpack_price = 20;
	private int basePizzaPrice;
	private boolean isExtrachese = false;
	private boolean isExtranTopping = false;
	private boolean isTakeAway = false;
	
	
	//  create a constructor
	
	public Pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300; // this is the most important
		}
		else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	
	// add the method
	
	 public void addExtrachese() { 
		 isExtrachese = true;
		 //System.out.println("Extra cheese added");
		 this.price+=extraChese_price;
		
	 }
	 
	 public void addExtraToppings() {
		 isExtranTopping = true;
		// System.out.println("extra topping added");
		 this.price+=extraTopping_price;
	 }
	 
	 public void TakeAway() {
		 isTakeAway = true;
		// System.out.println("Added your bahPack");
		 this.price+=Backpack_price;
	 }
	 
	 public void Bil() {
		 String bill = "";
		 System.out.println("Pizza : "+basePizzaPrice);
		 if(isExtrachese) {
			bill+="ExtraCheseAddPizza : "+extraChese_price+"\n";

		 }
		 if(isExtranTopping) {
			 System.out.println("ExtraToppingPizza : "+extraTopping_price + "\n");

		 }
		 if(isTakeAway) {
		 
		 System.out.println("BackPack Price : "+Backpack_price+"\n");
		 }
		 bill+="Bill : "+this.price + "\n";
		 System.out.println(bill);
	 }
	

}
