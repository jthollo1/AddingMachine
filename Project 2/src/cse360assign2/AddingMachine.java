//Assignment #: 2
//Name        : Joshua Holloway
//StudentID   : 1207270736
//Lecture     : W 9:40-10:30am
//Description : AddingMachine will add and subtract numbers from a stored int total
//				and will also format the output into a single string.

package cse360assign2;

public class AddingMachine 
{
	// declare variables
	private int total;
	private int count;
	private String totalstr;

	public AddingMachine() 
	{
		// initialize variables
		total = 0;
		count = 0;
		totalstr = "";
	}
	
	public int getTotal()
	{
		return total;
	}
	
	public void add(int newvalue) // this method adds the input to the total and adds it to the string
	{
		total += newvalue;
		buildString(currentOp("+") + newvalue); // made a buildString and currentOp method to better organize this process
		count++; // keeping count of operations
	}
	
	public void subtract(int newvalue) // this method subtracts the input from the total and adds it to the string
	{
		total -= newvalue;
		buildString(currentOp("-") + newvalue);
		count++;
	}
	
	private String buildString(String newstr) // this method makes a complete string of our inputs
	{									   // don't want a space before the first value
		if(totalstr.length() != 0) 
		{
			newstr = " " + newstr;
		}
		
		for(int i = 0; i < newstr.length(); i++) // inserting the built strings into a single string
		{
			totalstr += newstr.charAt(i);
		}
				
		return totalstr;
	}
	
	private String currentOp(String newop) // this method determines the operator and additional space 
	{									// that shows up before the input
		String operator = "";
		
		if(count != 0)
		{
			operator = newop + " "; // adding a space to keep things tidy
		}
		else if(count == 0 && newop == "-") // added special case if user does .subtract on first value
		{
			operator = newop;
		}
		else // don't want an operator before the first value
		{
			operator = "";
		}
		
		return operator;
	}
		
	public String toString() // no spaces after last value
	{
		return totalstr;
	}

	public void clear() // this method clears our variables
	{
		total = 0;
		count = 0;
		totalstr = "";	
	}
}
