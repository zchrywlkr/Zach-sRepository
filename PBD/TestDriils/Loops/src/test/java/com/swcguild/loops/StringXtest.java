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
public class StringXtest {
    
    public StringXtest() {
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
    //StringX("xxHxix") -> "xHix"
//StringX("abxxxcd") -> "abcd"
//StringX("xabxxxcdx") -> "xabcdx"
@Test
public void test(){
    assertEquals("xHix", StringX.StringX("xxHxix"));
    assertEquals("abcd",StringX.StringX("abxxxcd"));
    assertEquals("xabcdx",StringX.StringX("xabxxxcdx"));
}
}
