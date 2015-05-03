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
public class multipleEndingtest {
    
    public multipleEndingtest() {
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
    //MultipleEndings("Hello") -> "lololo"
//MultipleEndings("ab") -> "ababab"
//MultipleEndings("Hi") -> "HiHiHi"
    @Test
    public void test(){
        assertEquals("lololo",MultipleEnding.MultipleEndings("Hello"));
        assertEquals("ababab",MultipleEnding.MultipleEndings("ab"));
        assertEquals("HiHiHi",MultipleEnding.MultipleEndings("Hi"));
    }
}
