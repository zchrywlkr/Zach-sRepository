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
public class FirstLast6Test {
    
    public FirstLast6Test() {
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
    
    @Test
    public void testlast6(){
        int number[] = {1, 2, 6};
       
        assertTrue(FirstLast6.firstLast6(number));
    }
    @Test
    public void testfirst6(){
        int number[] = {6, 1, 2, 3};
       
        assertTrue(FirstLast6.firstLast6(number));
    }
    @Test
    public void testMiddle6(){
        int number[] = {13, 6, 1, 2, 3};
       
        assertFalse(FirstLast6.firstLast6(number));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
