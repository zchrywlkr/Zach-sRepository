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
public class FirstHalfTest {
    
    public FirstHalfTest() {
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
    //FirstHalf("WooHoo") -> "Woo"
//FirstHalf("HelloThere") -> "Hello"
//FirstHalf("abcdef") -> "abc"
    @Test
    public void test(){
        assertEquals("woo", FirstHalf.FirstHalf("woohoo"));
        assertEquals("Hello", FirstHalf.FirstHalf("HelloThere"));
        assertEquals("abc",FirstHalf.FirstHalf("abcdef"));
    }
}
