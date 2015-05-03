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
public class AltPairsTest {
    
    public AltPairsTest() {
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
    //AltPairs("kitten") -> "kien"
//AltPairs("Chocolate") -> "Chole"
//AltPairs("CodingHorror") -> "Congrr"
    @Test
    public void test(){
        assertEquals("kien",AltPairs.AltPairs("kitten"));
        assertEquals("Chol",AltPairs.AltPairs("Chocolate"));
        assertEquals("Congrr",AltPairs.AltPairs("CodingHorror"));
    }
}
