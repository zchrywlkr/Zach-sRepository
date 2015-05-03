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
public class AreInOrderTest {
    
    public AreInOrderTest() {
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
    // public void hello() {}//AreInOrder(1, 2, 4, false) → true
//AreInOrder(1, 2, 1, false) → false
//AreInOrder(1, 1, 2, true) → true

    @Test
    public void test(){
        assertTrue(AreInOrder.AreInOrder(1, 2, 4, false));
        assertFalse(AreInOrder.AreInOrder(1, 2, 1, false));
        assertTrue(AreInOrder.AreInOrder(1, 1, 2, true));
        
    }
}
