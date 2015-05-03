/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logic;

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
public class TwoIsOneTest {
    
    public TwoIsOneTest() {
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
    //TwoIsOne(1, 2, 3) → true
//TwoIsOne(3, 1, 2) → true
//TwoIsOne(3, 2, 2) → false
    @Test
    public void test(){
        assertTrue(TwoIsOne.TwoIsOne(1, 2, 3));
        assertTrue(TwoIsOne.TwoIsOne(3, 1, 2));
        assertFalse(TwoIsOne.TwoIsOne(3, 2, 2));
    }
}
