/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.testdrills;

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
public class SameFirstLastTest {
    
    public SameFirstLastTest() {
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
    
    //SameFirstLast({1, 2, 3}) -> false
//SameFirstLast({1, 2, 3, 1}) -> true
//SameFirstLast({1, 2, 1}) -> true
    
    @Test
    public void testNotSame(){
        int numbers[]= {1, 2, 3};
       
        assertFalse( SameFirstLast.Same(numbers));
    }
    @Test
    public void testSame4(){
        int numbers[]= {1, 2, 3, 1};
       
        assertTrue( SameFirstLast.Same(numbers));
    }
    @Test
    public void testSame3(){
        int numbers[]= {1, 2, 1};
       
        assertTrue( SameFirstLast.Same(numbers));
    }
}
