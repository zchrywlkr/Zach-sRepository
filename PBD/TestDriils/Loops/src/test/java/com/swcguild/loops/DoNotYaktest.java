/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

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
public class DoNotYaktest {
    
    public DoNotYaktest() {
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
    //DoNotYak("yakpak") -> "pak"
//DoNotYak("pakyak") -> "pak"
//DoNotYak("yak123ya") -> "123ya"
    @Test
    public void test(){
        assertEquals("pak",DoNotYak.DoNotYak("yakpak"));
        assertEquals("pak", DoNotYak.DoNotYak("pakyak"));
        assertEquals("123ya", DoNotYak.DoNotYak("yak123ya"));
        
    }
}
