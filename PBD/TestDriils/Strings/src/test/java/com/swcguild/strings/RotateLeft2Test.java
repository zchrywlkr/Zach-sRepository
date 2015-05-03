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
public class RotateLeft2Test {
    
    public RotateLeft2Test() {
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
    //Rotateleft2("Hello") -> "lloHe"
//Rotateleft2("java") -> "vaja"
//Rotateleft2("Hi") -> "Hi"
    @Test
    public void test(){
        assertEquals("llohe", RotateLeft2.Rotateleft2("hello"));
        assertEquals("vaja", RotateLeft2.Rotateleft2("java"));
        assertEquals("hi",RotateLeft2.Rotateleft2("hi"));
    }
}
