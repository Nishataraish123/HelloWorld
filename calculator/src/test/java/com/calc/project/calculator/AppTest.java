package com.calc.project.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 

    
    @Test
    public void Testsum()
    {
        assertEquals(30, Calculator.Sum(10,20));
    }
  
	@Test
    public void Testsubtract()
    {
        assertEquals(10, Calculator.Subtract(30,20));
    }
    @Test
    public void Testmultiply()
    {
        assertEquals(200, Calculator.Multiply(10,20));
    }
    @Test
    public void Testdivide()
    {
        assertEquals(6, Calculator.Divide(30,5));
    }
}