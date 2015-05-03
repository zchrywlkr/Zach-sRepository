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
public class InOrderEqualsTest {
    
    public InOrderEqualsTest() {
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
    //InOrderEqual(2, 5, 11, false) → true
//InOrderEqual(5, 7, 6, false) → false
//InOrderEqual(5, 5, 7, true) → true
    @Test
    public void test(){
        assertTrue(InOrderEquals.InOrderEqual(2, 5, 11, false));
        assertFalse(InOrderEquals.InOrderEqual(5,7,6,false));
        assertTrue(InOrderEquals.InOrderEqual(5,5,7,true));
    }
}
