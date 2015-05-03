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
public class SubStringMatchtest {
    
    public SubStringMatchtest() {
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
    //SubStringMatch("xxcaazz", "xxbaaz") -> 3
//SubStringMatch("abc", "abc") -> 2
//SubStringMatch("abc", "axc") -> 0
    @Test
    public void test(){
        assertEquals(3,SubStringMatch.SubStringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2,SubStringMatch.SubStringMatch("abc", "abc"));
        assertEquals(0,SubStringMatch.SubStringMatch("abc", "axc"));
    }
}
