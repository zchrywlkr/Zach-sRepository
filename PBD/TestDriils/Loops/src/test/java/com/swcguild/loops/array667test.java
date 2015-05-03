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
public class array667test {
    
    public array667test() {
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
    //Array667({6, 6, 2}) -> 1
//Array667({6, 6, 2, 6}) -> 1
//Array667({6, 7, 2, 6}) -> 1
    @Test
    public void test(){
        int nums1[] = {6,6,2};
        int nums2[] ={6,6,2,6};
        int nums3[] = {6,7,2,6};
        
        assertEquals(1,Array667.Array667(nums1));
        assertEquals(1,Array667.Array667(nums2));
        assertEquals(1,Array667.Array667(nums3));
    }
}
