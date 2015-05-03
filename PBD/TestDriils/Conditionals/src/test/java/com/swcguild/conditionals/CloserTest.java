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
public class CloserTest {
    
    public CloserTest() {
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
    //Closer(8, 13) -> 8
//Closer(13, 8) -> 8
//Closer(13, 7) -> 0
@Test
    public void test(){
        assertEquals(8,Closer.Closer(8, 13));
        assertEquals(8,Closer.Closer(13, 8));
        assertEquals(0,Closer.Closer(13, 7));
    }
}
