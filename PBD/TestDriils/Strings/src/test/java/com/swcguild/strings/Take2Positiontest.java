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
public class Take2Positiontest {
    
    public Take2Positiontest() {
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
    //TakeTwoFromPosition("java", 0) -> "ja"
//TakeTwoFromPosition("java", 2) -> "va"
//TakeTwoFromPosition("java", 3) -> "ja"
    @Test
    public void test(){
        assertEquals("ja",Take2position.TakeTwoFromPosition("java", 0));
        assertEquals("va",Take2position.TakeTwoFromPosition("java", 2));
        assertEquals("ja",Take2position.TakeTwoFromPosition("java", 3));
    }
}
