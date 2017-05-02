/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Miles
 *
 */
public class Exp8_HelloConstructor 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{

		HasName namedChild = new Child();
		SpendsMoney moneySpendingChild = new Child();
		AskForMoney moneyAskingChild = new Child();
		
		Child child1 = new Child(0, "John Jr", "Smith", 1000000, "pizza");
		Child child2a = new Child(0, child1.getName(), child1.getLastName(), 1000000, "pizza");
		Child child2b = new Child(child1);
		
		System.out.println("This is child 1 name: " + child1.getName());
		System.out.println("This is child 1 last name: " + child1.getLastName());
		System.out.println("This is child 1's debt: " + child1.getDebt() + "\n");
		
		System.out.println("This is child 2a name: " + child2a.getName());
		System.out.println("This is child 2a last name: " + child2a.getLastName());
		System.out.println("this is child 2a's debt: " + child2a.getDebt() + "\n");
		
		System.out.println("This is child 2b name: " + child2b.getName());
		System.out.println("This is child 2b last name: " + child2b.getLastName());
		System.out.println("This is child 2b's debt: " + child2b.getDebt() + "\n");	
	}
}
