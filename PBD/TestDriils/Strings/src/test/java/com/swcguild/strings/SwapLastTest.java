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
public class SwapLastTest {
    
    public SwapLastTest() {
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
    //SwapLast("coding") -> "codign"
//SwapLast("cat") -> "cta"
//SwapLast("ab") -> "ba"
    @Test
    public void test(){
        assertEquals("codign",SwapLast.SwapLast("coding"));
        assertEquals("cta",SwapLast.SwapLast("cat"));
        assertEquals("ba",SwapLast.SwapLast("ab"));
}
}
