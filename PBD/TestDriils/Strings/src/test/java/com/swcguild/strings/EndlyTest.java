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
public class EndlyTest {
    
    public EndlyTest() {
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
    //EndsWithLy("oddly") -> true
//EndsWithLy("y") -> false
//EndsWithLy("oddy") -> false
    @Test
    public void test(){
        assertTrue(Endly.EndsWithLy("oddly"));
        assertFalse(Endly.EndsWithLy("y"));
        assertFalse(Endly.EndsWithLy("odddy"));
}
}