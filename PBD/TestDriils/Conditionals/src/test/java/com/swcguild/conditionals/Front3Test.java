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
public class Front3Test {
    
    public Front3Test() {
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
    //Front3("Microsoft") -> "MicMicMic"
//Front3("Chocolate") -> "ChoChoCho"
//Front3("at") -> "atatat"
    @Test
    public void test(){
        assertEquals("MicMicMic",Front3.Front3("Microsoft"));
        assertEquals("ChoChoCho" , Front3.Front3("Chocolate"));
        assertEquals("atatat", Front3.Front3("at"));
        
    }
}
