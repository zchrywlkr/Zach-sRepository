/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logic;

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
public class AnswerCallTest {
    
    public AnswerCallTest() {
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
    //AnswerCell(false, false, false) → true
//AnswerCell(false, false, true) → false
//AnswerCell(true, false, false) → false
    @Test
    public void test(){
        assertTrue(AnswerCall.AnswerCell(false, false, false));
        assertFalse(AnswerCall.AnswerCell(false, false, true));
        assertFalse(AnswerCall.AnswerCell(true, false, false));
    }
}
