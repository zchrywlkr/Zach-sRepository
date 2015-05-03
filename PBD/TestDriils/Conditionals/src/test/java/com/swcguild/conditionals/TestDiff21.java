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
public class TestDiff21 {
    
    public TestDiff21() {
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
//    Diff21(23) -> 4
//Diff21(10) -> 11
//Diff21(21) -> 0
    @Test
    public void test23(){
        assertEquals(4,Diff21.Diff21(23));
    } 
      @Test
    public void test10(){
        assertEquals(10,Diff21.Diff21(11));
    } 
      @Test
    public void test21(){
        assertEquals(0,Diff21.Diff21(21));
    } 
}
