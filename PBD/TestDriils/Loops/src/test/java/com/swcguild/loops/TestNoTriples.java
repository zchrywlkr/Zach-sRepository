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
public class TestNoTriples {
    
    public TestNoTriples() {
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
//    NoTriples({1, 1, 2, 2, 1}) -> true
//NoTriples({1, 1, 2, 2, 2, 1}) -> false
//NoTriples({1, 1, 1, 2, 2, 2, 1}) -> false
    @Test
    public void testTrue(){
        int numbers[] = {1,1,2,2,1};
        assertTrue(NoTriples.NoTriples(numbers));
        
    }
    @Test
    public void testFalse(){
        int  numbers[] = {1,1,2,2,2,1};
        int numbers2[] = {1,1,1,2,2,2,1};
        
        assertFalse(NoTriples.NoTriples(numbers));
        assertFalse(NoTriples.NoTriples(numbers2));
    }
}
