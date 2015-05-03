/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionals;

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
public class Between10and20Test {
    
    public Between10and20Test() {
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
    // public void hello() {}\
    //Between10and20(12, 99) -> true
//Between10and20(21, 12) -> true
//Between10and20(8, 99) -> false
    @Test
    public void test(){
        assertTrue(Between10and20.Between10and20(12, 99));
        assertTrue(Between10and20.Between10and20(21, 12));
        assertFalse(Between10and20.Between10and20(8, 99));
        
    }
}
