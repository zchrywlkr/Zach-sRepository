/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionals;

import com.swcguild.conditionals.MischeviousChildren;
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
public class TestMichevious {
    
    public TestMichevious() {
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
    public void testinTrouble(){
       boolean a = true;
       boolean b = true;
       boolean c= false;
       boolean d = false;
       
       assertTrue(MischeviousChildren.inTrouble(a, b));
       assertTrue(MischeviousChildren.inTrouble(c, d));
    }
    public void testNoTrouble(){
        boolean a= true;
        boolean b = false;

        assertFalse(MischeviousChildren.inTrouble(a, b));
        
    }
}
