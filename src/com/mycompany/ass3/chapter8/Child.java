/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Miles
 *
 */
public class Child extends Parent implements AskForMoney, SpendsMoney 
{
	private String favoriteFood;
	
	public Child()
	{
		// super();
	}
	
	public Child(float _debt, String _name, String _lastName, float _wealth, String _favoriteFood) 
	{
		super(_debt, _name, _lastName, _wealth);
		favoriteFood = _favoriteFood;
	}
	
	// Copy constructor
	public Child(Child c) 
	{
		this(c.getDebt(), c.getName(), c.getLastName(), c.wealth, c.favoriteFood);
	}
	
	public boolean spendMoney(float _money2spend) 
	{
		boolean retVal = false;
		if (_money2spend <= wealth) 
		{
			wealth -= _money2spend;
			retVal = true;
		}
		return retVal;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.ass3.chapter8.AskForMoney#investInMe(float)
	 */
	@Override
	public float investInMe(float _amount2ask) 
	{
		return 0;
	}
}
