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
public class TestSleeping {

    public TestSleeping() {
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
    //sleepIn(false, false) -> true
//sleepIn(true, false) -> false
//sleepIn(false, true) -> true
    @Test
    public void testSleepIn() {
        assertTrue(Sleeping.CanSleepIn(false, false));
        assertTrue(Sleeping.CanSleepIn(false, true));

    }
    @Test
    public void testCantSleepIn(){
        assertFalse(Sleeping.CanSleepIn(true, false));
    }

}
