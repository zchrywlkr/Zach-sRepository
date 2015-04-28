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
public class KeepLastTest {
    
    public KeepLastTest() {
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
    public void testAll(){
        int nums[] = {4,5,6};
        int nums2[] = { 1,2};
        int nums3[] = {3};
        
        int test[] = {0,0,0,0,0,6};
        int test2[] = {0,0,0,2};
        int test3[] = {0,3};
        
        Assert.assertArrayEquals(test,KeepLast.KeepLast(nums));
        Assert.assertArrayEquals(test2,KeepLast.KeepLast(nums2));
        Assert.assertArrayEquals(test3,KeepLast.KeepLast(nums3));
    }
}
