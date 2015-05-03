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
public class Count9test {

    public Count9test() {
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
    //Count9({1, 2, 9}) -> 1
//Count9({1, 9, 9}) -> 2
//Count9({1, 9, 9, 3, 9}) -> 3
    @Test
    public void test() {
        int num1[] = {1, 2, 9};
        int num2[] = {1, 9, 9};
        int num3[] = {1, 9, 9, 3, 9};

        assertEquals(1, Count9.Count9(num1));
        assertEquals(2, Count9.Count9(num2));
        assertEquals(3, Count9.Count9(num3));
    }
}
