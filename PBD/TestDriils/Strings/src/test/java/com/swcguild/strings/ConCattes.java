package com.swcguild.strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.strings.ConCat;
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
public class ConCattes {
    
    public ConCattes() {
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
    //ConCat("abc", "cat") -> "abcat"
//ConCat("dog", "cat") -> "dogcat"
//ConCat("abc", "") -> "abc"
    
    @Test
    public void test(){
        assertEquals("abcat",ConCat.ConCat("abc", "cat"));
        assertEquals("dogcat",ConCat.ConCat("dog", "cat"));
        assertEquals("abc",ConCat.ConCat("abc", ""));
    }
}
