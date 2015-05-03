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
public class StartOZtest {
    
    public StartOZtest() {
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
    //StartOz("ozymandias") -> "oz"
//StartOz("bzoo") -> "z"
//StartOz("oxx") -> "o" 
    @Test
    public void test(){
        assertEquals("oz",StartOz.StartOz("ozymandias"));
        assertEquals("z",StartOz.StartOz("bzoo"));
        assertEquals("o",StartOz.StartOz("oxx"));
    }
}
