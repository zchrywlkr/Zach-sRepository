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
public class HasBadTest {
    
    public HasBadTest() {
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
    //HasBad("badxx") -> true
//HasBad("xbadxx") -> true
//HasBad("xxbadxx") -> false
    @Test
    public void test(){
        assertTrue(HasBad.HasBad("badxx"));
        assertTrue(HasBad.HasBad("xbadxx"));
        assertFalse(HasBad.HasBad("xxbadxx"));
    }
}
