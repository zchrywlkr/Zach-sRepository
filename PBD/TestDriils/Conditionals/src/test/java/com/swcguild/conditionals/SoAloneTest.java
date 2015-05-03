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
public class SoAloneTest {
    
    public SoAloneTest() {
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
    //SoAlone(13, 99) -> true
//SoAlone(21, 19) -> true
//SoAlone(13, 13) -> false
    @Test
    public void test(){
        assertTrue(SoAlone.SoAlone(13, 99));
        assertTrue(SoAlone.SoAlone(21, 19));
        assertFalse(SoAlone.SoAlone(13, 13));
    }
}
