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
public class RollDicetest {
    
    public RollDicetest() {
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
    //RollDice(2, 3, true) → 5
//RollDice(3, 3, true) → 7
//RollDice(3, 3, false) → 6

    @Test
    public void test(){
        assertEquals(5,RollDice.RollDice(2, 3, true));
        assertEquals(7,RollDice.RollDice(3, 3, true));
        assertEquals(6,RollDice.RollDice(3, 3, false));
    }
}
