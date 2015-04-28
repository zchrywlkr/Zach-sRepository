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
public class Fix23Test {

    public Fix23Test() {
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
    public void test() {
        int nums[] = {1, 2, 3};
        int test1[] = {1, 2, 0};
        int nums2[] = {2, 3, 5};
        int test2[] = {2, 0, 5};
        int nums3[] = {1, 2, 1};
        int test3[] = {1, 2, 1};
        
        Assert.assertArrayEquals(test1, Fix23.Fix23(nums));
        Assert.assertArrayEquals(test2, Fix23.Fix23(nums2));
        Assert.assertArrayEquals(test3, Fix23.Fix23(nums3));

    }
}
