package BillIng_System;

import java.util.Scanner;

public class Item {
	private String name;
	private int id=1000;
	private String Customerid;
	private int date =10_3_3023;
	
	public Item() {
		
		
		// called a manu box
		//this.Manubox();
		// called a customer interface
		//this.customer();
		this.Bil();
	}
	
	// generate a Manu box
	private void Manubox() {
		System.out.println("\t Welcome To Pizza House");
		
		System.out.println("\n Manu : ");
		System.out.println("-----------");

		System.out.println("1 -->  Pizza");
		System.out.println("2 -->  Hot Pizza");
		System.out.println("3 -->  Lazy Pizza");
		System.out.println("4 -->  Hot Dog");
		System.out.println("5 -->  Water");
		System.out.println("6 -->  Coke");

	}
	
	// generate a customer interface
	
	private void customer() {
		this.Manubox();
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		
		 {
			System.out.print("Enter your choice : ");
			switch(choice) {
			case 1 : 
				int price=0;
				price = price + 160;
				System.out.println("\nPizza ---------------	: $"+price);
				break;
			
			case 2 : 
				int price1=0;
				price1 = price1 +250;
				System.out.println("\nLazy Pizza ----------------- : $"+price1);
				break;
				
			case 3 : 
				int price2=0;
				price2 = price2 +220;
				System.out.println("\nHot Pizza ----------------- : $"+price2);
				break;
				
			case 4 : 
				int price3=0;
				price3 = price3 +220;
				System.out.println("\nHot DOg ----------------- : $"+price3);
				break;
				
			case 5 : 
				int price4=0;
				price4 = price4 +220;
				System.out.println("\nWater ----------------- : $"+price4);
				break;
				
			case 6 : 
				int price5=0;
				price5 = price5 +220;
				System.out.println("\nHot Pizza ----------------- : $"+price5);
				break;
			
	
		}
		}
		
	}
	private void name() {
		Scanner in = new Scanner(System.in);
		System.out.print("Coustomer Name : ");
		name = in.nextLine();
		
		
		
		
	}
	private void CustomerId() {
		int x = id++;
		System.out.println("Id  : "+x+date);
		
	}
	
	private void Bil() {
		this.name();
		this.CustomerId();
		this.customer();

	}
}
