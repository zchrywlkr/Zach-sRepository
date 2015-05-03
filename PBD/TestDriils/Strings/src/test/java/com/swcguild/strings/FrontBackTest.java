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
public class FrontBackTest {
    
    public FrontBackTest() {
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
    //FrontAndBack("Hello", 2) -> "Helo"
//FrontAndBack("Chocolate", 3) -> "Choate"
//FrontAndBack("Chocolate", 1) -> "Ce"
    @Test
    public void test(){
        assertEquals("Helo",FrontBack.FrontAndBack("Hello", 2));
        assertEquals("Choate",FrontBack.FrontAndBack("Chocolate", 3));
        assertEquals("Ce",FrontBack.FrontAndBack("Chocolate", 1));
    }
}
