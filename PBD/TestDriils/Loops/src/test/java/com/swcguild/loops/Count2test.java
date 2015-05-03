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
public class Count2test {
    
    public Count2test() {
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
    //CountLast2("hixxhi") -> 1
//CountLast2("xaxxaxaxx") -> 1
//CountLast2("axxxaaxx") -> 2
    @Test
    public void testhixxhi(){
        assertEquals(1,CountLast2.CountLast2("hixxhi"));
    }
    @Test
    public void testxaxxaxaxx(){
        assertEquals(1,CountLast2.CountLast2("xaxxaxaaxx"));
    }
   
      @Test
    public void testaxxxaaxx(){
        assertEquals(2,CountLast2.CountLast2("axxxaaxx"));
    }
   
}
