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
public class hasTeenTest {
    
    public hasTeenTest() {
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
    //HasTeen(13, 20, 10) -> true
//HasTeen(20, 19, 10) -> true
//HasTeen(20, 10, 12) -> false
@Test
    public void test(){
        assertTrue(HasTeen.HasTeen(13, 20, 10));
        assertTrue(HasTeen.HasTeen(20, 19, 10));
        assertFalse(HasTeen.HasTeen(20, 10, 12));
    }
}
