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
public class TestUnlucky1 {
    
    public TestUnlucky1() {
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
//    Unlucky1({1, 3, 4, 5}) -> true
//Unlucky1({2, 1, 3, 4, 5}) -> true
//Unlucky1({1, 1, 1}) -> false
    @Test
    public void testTrue(){
        
        int nums[] = {1,3,4,5};
         int nums2[] = {2,1,3,4,5};
        assertTrue(Unlucky1.Unlucky1(nums));
        assertTrue(Unlucky1.Unlucky1(nums2));
    }
      @Test
    public void testFalse(){
        
        int nums[] = {1,1,1};
         
        assertFalse(Unlucky1.Unlucky1(nums));
        
    }
}
