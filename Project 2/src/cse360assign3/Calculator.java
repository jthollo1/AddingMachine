//Assignment #: 3
//Name        : Joshua Holloway
//StudentID   : 1207270736
//Lecture     : W 9:40-10:30am
//Description : Calculator will inherit AddingMachine and will add three additional methods
//				mult, div, and power.

package cse360assign3;

public class Calculator extends AddingMachine
{
	public Calculator()
	{
		
	}
	
	public void mult(int newvalue)
	{
		buildString(currentOp("*") + newvalue);
		
		total *= newvalue;
		count++;
	}
	
	public void div(int newvalue)
	{
		buildString(currentOp("/") + newvalue);
		
		if(newvalue == 0)
		{
			total = 0;
		}
		else
		{
			total /= newvalue;
			count++;
		}
	}	
	
	public void power(int newvalue)
	{
		buildString(currentOp("^") + newvalue);
		
		if (newvalue < 0)
		{
			total = 0;
		}
		else
		{
			int temptotal = total;
			
			for(int i = 0; i < newvalue-1; i++)
			{
				total = temptotal * total;
			}
			count++;
		}
	}
}
