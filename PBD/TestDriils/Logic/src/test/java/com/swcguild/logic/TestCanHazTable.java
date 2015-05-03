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
public class TestCanHazTable {
    
    public TestCanHazTable() {
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
    //CanHazTable(5, 10) → 2
//CanHazTable(5, 2) → 0
//CanHazTable(5, 5) → 1
    @Test
    public void testYes(){
        assertEquals(2,CanHazTable.CanHazTable(5, 10));
    }
    @Test
    public void testNo(){
        assertEquals(0,CanHazTable.CanHazTable(5, 2));
    }
    @Test
    public void testMaybe(){
        assertEquals(1,CanHazTable.CanHazTable(5, 5));
    }
}
