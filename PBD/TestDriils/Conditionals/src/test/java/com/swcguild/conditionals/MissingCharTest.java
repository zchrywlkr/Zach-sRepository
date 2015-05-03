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
public class MissingCharTest {
    
    public MissingCharTest() {
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
    
    //MissingChar("kitten", 1) -> "ktten"
//MissingChar("kitten", 0) -> "itten"
//MissingChar("kitten", 4) -> "kittn"
    
    @Test
    public void test(){
        assertEquals("ktten", MissingChar.MissingChar("kitten", 1));
        assertEquals("itten",MissingChar.MissingChar("kitten", 0));
        assertEquals("kittn",MissingChar.MissingChar("kitten", 4));
        
    }
}
