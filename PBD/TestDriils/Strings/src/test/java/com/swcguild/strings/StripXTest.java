/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.strings;

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
public class StripXTest {
    
    public StripXTest() {
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
    //StripX("xHix") -> "Hi"
//StripX("xHi") -> "Hi"
//StripX("Hxix") -> "Hxi"
    
    @Test
    public void testxhix(){
        assertEquals("Hi", StripX.StripX("xHix"));
    }
    @Test
    public void testxhi(){
        assertEquals("Hi", StripX.StripX("xHi"));
    }
    @Test
    public void testhxhix(){
        assertEquals("Hxi", StripX.StripX("Hxix"));
    }
    
}
