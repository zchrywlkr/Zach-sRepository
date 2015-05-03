/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionals;

import com.swcguild.conditionals.SumDouble;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class TestSumDouble {
    
    public TestSumDouble() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //SumDouble(1, 2) -> 3
//SumDouble(3, 2) -> 5
//SumDouble(2, 2) -> 8
    
    @Test
    public void testnotsame(){
        
        assertEquals(3,SumDouble.SumDouble(1,2));
        assertEquals(5,SumDouble.SumDouble(3, 2));
        
    }
    @Test
    public void testSame(){
        
        assertEquals(8,SumDouble.SumDouble(2,2));
        
    }
}
