package com.swcguild.simplecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author terry
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 2), 4);
    }
    
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(calc.subtract(2, 2), 0);
    }
    
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(2, 2), 4);
    }
    
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(calc.divide(2, 2), 1);
    }
}
