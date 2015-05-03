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
public class EndupTest {
    
    public EndupTest() {
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
    //EndUp("Hello") -> "HeLLO"
    //EndUp("hi there") -> "hi thERE"
    //EndUp("hi") -> "HI
    @Test
    public void test(){
        assertEquals("heLLO",EndUp.EndUp("hello"));
        assertEquals("hi thERE" , EndUp.EndUp("hi there"));
        assertEquals("HI",EndUp.EndUp("hi"));
    }
}
