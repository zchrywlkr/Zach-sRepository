/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

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
public class TestStringTime {
    
    public TestStringTime() {
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
    
    @Test
    public void test2n(){
        assertEquals("HiHi" , StringTimes.StringTimes("Hi", 2));
    }
    @Test
    public void test3n(){
        assertEquals("HiHiHi" , StringTimes.StringTimes("Hi", 3));
    }
    @Test
    public void test1n(){
        assertEquals("Hi" , StringTimes.StringTimes("Hi", 1));
    }
}
