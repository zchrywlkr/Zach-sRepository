/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.testdrills;

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
public class TestRotateLeft {
    
    public TestRotateLeft() {
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
    
    @Test
    public void testRotatetion(){
        int a[] = {1, 2, 3};
        int b[] = {2, 3, 1};
        int c[] = {5,11,9};
        int d[] = {11,9,5};
        int e[] = {7,0,0};
        int f[] = {0,0,7};
        
        assertArrayEquals(b,RotateLeft.Rotate(a));
        assertArrayEquals(d,RotateLeft.Rotate(c));
        assertArrayEquals(f,RotateLeft.Rotate(e));
    }
    
}
