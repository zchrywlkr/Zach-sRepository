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
public class TestSum {
    
    public TestSum() {
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
    
    @Test
    public void testSumSix(){
        int numbers [] = {1, 2, 3};
        assertEquals(6,Sum.sums(numbers));
    }
    
    @Test
    public void testSum18(){
        int numbers [] = {5, 11, 2};
        assertEquals(18,Sum.sums(numbers));
    }
    
    @Test
    public void testSum7(){
        int numbers [] = {7, 0, 0};
        assertEquals(7,Sum.sums(numbers));
    }
}
