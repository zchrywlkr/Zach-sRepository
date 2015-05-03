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
public class Love6Test {
    
    public Love6Test() {
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
    //LoveSix(6, 4) → true
//LoveSix(4, 5) → false
//LoveSix(1, 5) → true
    @Test
    public void test(){
        assertTrue(LoveSix.LoveSix(6, 4));
        assertTrue(LoveSix.LoveSix(1, 5));
        assertFalse(LoveSix.LoveSix(4, 5));
        
    }
}
