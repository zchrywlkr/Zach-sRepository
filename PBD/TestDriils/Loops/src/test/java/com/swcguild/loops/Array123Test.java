/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

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
public class Array123Test {
    
    public Array123Test() {
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
    //Array123({1, 1, 2, 3, 1}) -> true
//Array123({1, 1, 2, 4, 1}) -> false
//Array123({1, 1, 2, 1, 2, 3}) -> true

    @Test
    public void test(){
        int num1[] = {1,1,2,3,1};
        int num2[] = {1,1,2,4,1};
        int num3[] = {1,1,2,1,2,3};
        
        assertTrue(Array123.Array123(num1));
        assertFalse(Array123.Array123(num2));
        assertTrue(Array123.Array123(num3));
    }
}
