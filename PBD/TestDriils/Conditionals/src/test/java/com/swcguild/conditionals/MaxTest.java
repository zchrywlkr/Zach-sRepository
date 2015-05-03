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
public class MaxTest {
    
    public MaxTest() {
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
    
//Max(1, 2, 3) -> 3
//Max(1, 3, 2) -> 3
//Max(3, 2, 1) -> 3
    @Test
    public void test(){
        assertEquals(3,Max.Max(1, 2, 3));
        assertEquals(3,Max.Max(1, 3, 2));
        assertEquals(3,Max.Max(3, 2, 1));
        
    }
}
