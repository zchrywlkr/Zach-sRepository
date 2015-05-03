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
public class TestSpeeding {
    
    public TestSpeeding() {
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
    //
//CaughtSpeeding(60, false) → 0
//CaughtSpeeding(65, false) → 1
//CaughtSpeeding(65, true) → 0
    
    @Test
    public void testSpeed1(){
        assertEquals(1,CaughtSpeeding.CaughtSpeeding(65, false));
    }
    @Test
    public void testSpeed0(){
        assertEquals(0,CaughtSpeeding.CaughtSpeeding(60, false));
        assertEquals(0,CaughtSpeeding.CaughtSpeeding(65, true));
    }
}
