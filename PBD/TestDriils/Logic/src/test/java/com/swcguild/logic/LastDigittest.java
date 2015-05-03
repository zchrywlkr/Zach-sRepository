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
public class LastDigittest {
    
    public LastDigittest() {
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
//    LastDigit(23, 19, 13) → true
//LastDigit(23, 19, 12) → false
//LastDigit(23, 19, 3) → true
    @Test
    public void test(){
        assertTrue(LastDigit.LastDigit(23, 19, 13));
        assertFalse(LastDigit.LastDigit(23, 19, 12));
        assertTrue(LastDigit.LastDigit(23, 19, 3));
    }
}
