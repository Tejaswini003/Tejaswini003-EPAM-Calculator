package com.code.basic;

import static org.junit.Assert.*;

public class calcTest
{
public void test() 
{
	calculator cal = new calculator();
	
	// test the Addition function 

	int answer = cal.add(29,20);

	assertEquals(49,answer);

	
	// test the Subtract function
	
	answer = cal.subtract(5, 2);
			
	assertEquals(3, answer);
			
		
	// test the Multiply function

	answer = cal.multiply(3, 2);

	assertEquals(6,answer);


	// test the Divide function

	answer = cal.divide(89,49);

	assertEquals(1, answer);
	
	
    // test the Modulus function
	
    answer =cal.modulus(8, 4);
      
    assertEquals(0, answer);

	

}

}