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
public class Take1Test {
    
    public Take1Test() {
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
    //TakeOne("Hello", true) -> "H"
//TakeOne("Hello", false) -> "o"
//TakeOne("oh", true) -> "o"

    @Test
    public void test(){
        assertEquals("h",TakeOne.TakeOne("hello", true));
        assertEquals("o",TakeOne.TakeOne("Hello", false));
        assertEquals("o",TakeOne.TakeOne("oh", true));
    }
}
