/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.junitexample;

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
public class GreatPartyTest {
    
    public GreatPartyTest() {
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
    public void GreatPartyTest30False(){
        
        boolean result = GreatParty.greatParty(30,false);
        assertFalse(result);
    }
    @Test
    public void GreatPartyTest40True(){
        
        assertTrue(GreatParty.greatParty(40,false));
        assertTrue(GreatParty.greatParty(40,true));
    }
    
    @Test
    public void GreatPartyTest50False(){
        
        assertTrue(GreatParty.greatParty(50,false));
    }
    
    @Test
    public void GreatPartyTest70True(){
        assertTrue(GreatParty.greatParty(70, true));
    }
   
}
