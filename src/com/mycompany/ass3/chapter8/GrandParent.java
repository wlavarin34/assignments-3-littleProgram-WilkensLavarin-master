/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Miles
 *
 */
public class GrandParent implements HasName 
{
	private float debt;
	private String lastName;
	private String name;
	
	public GrandParent()
	{
		this(0, "Grandpa", "Britt");
	}
	
	public GrandParent(float _debt, String _name, String _lastName) 
	{
		this.debt = _debt;
		lastName = _lastName;
		name = _name;
	}
	
	@Override
	public String getName() 
	{
		return name;
	}
	
	@Override
	public String getLastName() 
	{
		return lastName;
	}
	
	public float getDebt()
	{
		return debt;
	}
}
