/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logic;

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
public class TestSkipSum {
    
    public TestSkipSum() {
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
    public void test7(){
        assertEquals(7,SkipSum.SkipSum(3, 4));
    }
    @Test
    public void test20(){
        assertEquals(20,SkipSum.SkipSum(9,4));
    }
    @Test
    public void test21(){
        assertEquals(21,SkipSum.SkipSum(10, 11));
    }
    
}
