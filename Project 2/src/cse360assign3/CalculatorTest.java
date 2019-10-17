//Assignment #: 3
//Name        : Joshua Holloway
//StudentID   : 1207270736
//Lecture     : W 9:40-10:30am
//Description : Calculator will test AddingMachine and will test the three additional methods
//				mult, div, and power.

package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test1() 
	{
		String ans = "2 * 4 * 8 / 16 Total is: 4";
		Calculator Calc = new Calculator();
		
		Calc.add(2);
		Calc.mult(4);
		Calc.mult(8);
		Calc.div(16);
		
		System.out.println(Calc.toString() + " Total is: " + Calc.getTotal());
		assertEquals(ans,Calc.toString() + " Total is: " + Calc.getTotal());
	}

	@Test
	void test2() 
	{
		String ans = "-1 + 3 * 2 / 2 ^ 3 Total is: 8";
		Calculator Calc = new Calculator();
		
		Calc.subtract(1);
		Calc.add(3);
		Calc.mult(2);
		Calc.div(2);
		Calc.power(3);
		
		System.out.println(Calc.toString() + " Total is: " + Calc.getTotal());
		assertEquals(ans,Calc.toString() + " Total is: " + Calc.getTotal());
	}
	
	@Test
	void test3() 
	{
		String ans = "3 + 3 * 2 / 2 ^ -1 Total is: 0";
		Calculator Calc = new Calculator();
		
		Calc.subtract(-3);
		Calc.add(3);
		Calc.mult(2);
		Calc.div(2);
		Calc.power(-1);
		
		System.out.println(Calc.toString() + " Total is: " + Calc.getTotal());
		assertEquals(ans,Calc.toString() + " Total is: " + Calc.getTotal());
	}
	
	@Test
	void test4() 
	{
		String ans = "2 + 6 / 2 * 10 / 0 Total is: 0";
		Calculator Calc = new Calculator();
		
		Calc.add(2);
		Calc.add(6);
		Calc.div(2);
		Calc.mult(10);
		Calc.div(0);
		
		System.out.println(Calc.toString() + " Total is: " + Calc.getTotal());
		assertEquals(ans,Calc.toString() + " Total is: " + Calc.getTotal());
	}
	
	@Test
	void test5() 
	{
		String ans = "3 ^ 3 + 1 * 10 / 0 ^ -2 Total is: 0";
		Calculator Calc = new Calculator();
		
		Calc.add(3);
		Calc.power(3);
		Calc.add(1);
		Calc.mult(10);
		Calc.div(0);
		Calc.power(-2);
		
		System.out.println(Calc.toString() + " Total is: " + Calc.getTotal());
		assertEquals(ans,Calc.toString() + " Total is: " + Calc.getTotal());
	}
}
