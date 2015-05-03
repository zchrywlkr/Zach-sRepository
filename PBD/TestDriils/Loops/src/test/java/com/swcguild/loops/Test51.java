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
public class Test51 {
    
    public Test51() {
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
    //Pattern51({1, 2, 7, 1}) -> true
//Pattern51({1, 2, 8, 1}) -> false
//Pattern51({2, 7, 1}) -> true
    @Test
    public void testTrue(){
        int numbers[] = {1,2,7,1};
        int numbers2[] = {2,7,1};
        assertTrue(Pattern51.Pattern51(numbers));
        assertTrue(Pattern51.Pattern51(numbers2));
    }
    public void testFalse(){
        int numbers[] = {1,2,8,1};
        assertFalse(Pattern51.Pattern51(numbers));
    }
}
