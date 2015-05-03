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
public class special11Test {
    
    public special11Test() {
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
    //SpecialEleven(22) → true
//SpecialEleven(23) → true
//SpecialEleven(24) → false
    @Test
    public void test(){
        assertTrue(Special11.SpecialEleven(22));
        assertTrue(Special11.SpecialEleven(23));
        assertFalse(Special11.SpecialEleven(24));
    }
}
