//Assignment #: 2
//Name        : Joshua Holloway
//StudentID   : 1207270736
//Lecture     : W 9:40-10:30am
//Description : Class AddingMachineTest will test AddingMachine and compare it's toString()
//				output to the expected output.

package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest 
{

	@Test
	void test1() 
	{
		String ans = "4 - 1 + 3";
		AddingMachine Calc = new AddingMachine();
		
		Calc.add(4);
		Calc.subtract(1);
		Calc.add(3);

		System.out.println(Calc.toString());
		assertEquals(ans,Calc.toString());
	}
	
	@Test
	void test2() 
	{
		String ans = "-1 + 0 + 9";
		AddingMachine Calc = new AddingMachine();
		
		Calc.subtract(1);
		Calc.add(0);
		Calc.add(9);
		
		System.out.println(Calc.toString());
		assertEquals(ans,Calc.toString());
	}
	
	@Test
	void test3() 
	{
		String ans = "10 - 11 - 15 + 3";
		AddingMachine Calc = new AddingMachine();
		
		Calc.add(10);
		Calc.subtract(11);
		Calc.subtract(15);
		Calc.add(3);

		System.out.println(Calc.toString());
		assertEquals(ans,Calc.toString());
	}
	
	@Test
	void test4() 
	{
		String ans = "-4 - -1 + -3 + 3 - 2";
		AddingMachine Calc = new AddingMachine();
		
		Calc.add(-4);
		Calc.subtract(-1);
		Calc.add(-3);
		Calc.add(3);
		Calc.subtract(2);

		System.out.println(Calc.toString());
		assertEquals(ans,Calc.toString());
	}
	
	@Test
	void test5() 
	{
		String ans = "400 - 1100 + 3200 - 1000 + -5500 - 0";
		AddingMachine Calc = new AddingMachine();
		
		Calc.add(400);
		Calc.subtract(1100);
		Calc.add(3200);
		Calc.subtract(1000);
		Calc.add(-5500);
		Calc.subtract(0);

		System.out.println(Calc.toString());
		assertEquals(ans,Calc.toString());
	}

}
