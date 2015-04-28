/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.testdrills;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class HigherNumberTest {
    
    public HigherNumberTest() {
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
    //HigherWins({1, 2, 3}) -> {3, 3, 3}
//HigherWins({11, 5, 9}) -> {11, 11, 11}
//HigherWins({2, 11, 3}) -> {3, 3, 3}
    @Test
    public void testHigher(){
        int nums[] = {1,2,3};
        int nums2[] = {11,5,9};
        int nums3[] = {2,11,3};
        int test1[] = {3,3,3};
        int test2[] = {11,11,11};
        int test3[] = {3,3,3};
        
        Assert.assertArrayEquals(test1,HigherWins.HigherWins(nums));
        Assert.assertArrayEquals(test2,HigherWins.HigherWins(nums2));
        Assert.assertArrayEquals(test3,HigherWins.HigherWins(nums3));
        
    }
}
