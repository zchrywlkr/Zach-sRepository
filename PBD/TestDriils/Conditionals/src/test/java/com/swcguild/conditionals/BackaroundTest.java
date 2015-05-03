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
public class BackaroundTest {
    
    public BackaroundTest() {
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
    //BackAround("cat") -> "tcatt"
//BackAround("Hello") -> "oHelloo"
//BackAround("a") -> "aaa"
    @Test
    public void testAll(){
        assertEquals("tcatt",BackAround.BackAround("cat"));
        assertEquals("oHelloo",BackAround.BackAround("Hello"));
        assertEquals("aaa", BackAround.BackAround("a"));
        
    }
}
