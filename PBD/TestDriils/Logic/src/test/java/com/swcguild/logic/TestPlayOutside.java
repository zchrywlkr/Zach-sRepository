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
public class TestPlayOutside {
    
    public TestPlayOutside() {
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
    //PlayOutside(70, false) → true
    //PlayOutside(95, false) → false
    //PlayOutside(95, true) → true
    @Test
    public void testTrue(){
        assertTrue(PlayOutside.PlayOutside(70, true));
        assertTrue(PlayOutside.PlayOutside(95, true));
    }
    @Test
    public void testFalse(){
        assertFalse(PlayOutside.PlayOutside(95, false));
    }
}
