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
public class IxstartTest {
    
    public IxstartTest() {
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
//    
//IxStart("mix snacks") -> true
//IxStart("pix snacks") -> true
//IxStart("piz snacks") -> false
    
    @Test
    public void test(){
        assertTrue(IxStart.IxStart("mix snacks"));
        assertTrue(IxStart.IxStart("pix snacks"));
        assertFalse(IxStart.IxStart("piz snacks"));
    }
}
