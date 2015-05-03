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
public class LongInMiddleTest {
    
    public LongInMiddleTest() {
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
    
    //LongInMiddle("Hello", "hi") -> "hiHellohi"
//LongInMiddle("hi", "Hello") -> "hiHellohi"
//LongInMiddle("aaa", "b") -> "baaab"
    @Test
    public void test(){
        assertEquals("hiHellohi",LongInMiddle.LongInMiddle("Hello", "hi"));
        assertEquals("hiHellohi",LongInMiddle.LongInMiddle("hi", "Hello"));
        assertEquals("baaab", LongInMiddle.LongInMiddle("aaa", "b"));
    }
}
