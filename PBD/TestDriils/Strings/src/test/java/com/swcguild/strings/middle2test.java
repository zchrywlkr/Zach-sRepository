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
public class middle2test {
    
    public middle2test() {
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
    //MiddleTwo("string") -> "ri"
//MiddleTwo("code") -> "od"
//MiddleTwo("Practice") -> "ct"
    @Test
    public void test(){
        assertEquals("ri",Middle2.MiddleTwo("String"));
        assertEquals("od",Middle2.MiddleTwo("code"));
        assertEquals("ct",Middle2.MiddleTwo("Practice"));
    }
}
