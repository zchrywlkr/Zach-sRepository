/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addresses.dao;

import com.swcguild.addresses.AddressException;
import com.swcguild.addresses.dto.Address;
import java.io.IOException;
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
public class AddressBookTest {
    AddressBook addressBook; 
    
    public AddressBookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       addressBook = new AddressBook();
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
    public void checkEmpty(){
        assertEquals(0,addressBook.countAddresses());   
    }
    @Test
    public void checkAdd(){
        Address address = new Address();
        addressBook.addAddress(address);
        assertEquals(1,addressBook.countAddresses());
        
    }
    
    @Test
    public void checkfindAddress(){
        Address address = new Address("First","last","street", "city","state","zip");
        addressBook.addAddress(address);
        assertEquals(address, addressBook.findAddress("last").get(0));
    }
      @Test
    public void removeAddresTest(){
          Address address = new Address("First","last","street", "city","state","zip");
        addressBook.addAddress(address);
        addressBook.removeAddress(address);
        assertEquals(0, addressBook.countAddresses());
    }
      @Test
    public void testSave() throws IOException, AddressException{
        
        Address address = new Address("First","last","street", "city","state","zip");
        AddressBook addressBook2 = new AddressBook();
        addressBook.addAddress(address);
        
        addressBook.save();
        
        addressBook2.read();
        assertTrue(addressBook.equals(addressBook2));     
//      assertEquals(1,addressBook2.countAddresses());
//      assertTrue(addressBook.getAddresses().equals(addressBook2.getAddresses()));   
    }
}
