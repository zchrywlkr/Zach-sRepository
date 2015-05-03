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
public class EveryNthtest {
    
    public EveryNthtest() {
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
//EveryNth("Miracle", 2) -> "Mrce"
//EveryNth("abcdefg", 2) -> "aceg"
//EveryNth("abcdefg", 3) -> "adg"
    @Test
    public void test(){
        assertEquals("Mrce", EveryNth.EveryNth("Miracle", 2));
        assertEquals("aceg", EveryNth.EveryNth("abcdefg", 2));
        assertEquals("adg", EveryNth.EveryNth("abcdefg", 3));
    }
}
