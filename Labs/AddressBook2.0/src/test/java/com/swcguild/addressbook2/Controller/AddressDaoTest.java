/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.Controller;

import com.swcguild.addressbook2.Dao.AddressDao;
import com.swcguild.addressbook2.Dao.AddressDaoFileImpl;
import com.swcguild.addressbook2.Dto.Address;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class AddressDaoTest {
    AddressDao dao;
    Address a1;
    Address a2;
    Address a3;
    
    public AddressDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dao = new AddressDaoFileImpl();
        a1 = new Address();
        a2 = new Address();
        a3 = new Address();
        a1.setCity("city");
        a1.setFirstName("first");
        a1.setLastName("last");
        a1.setState("state");
        a1.setZipCode("12345");
        a1.setId("1");
        a2.setId("2");
        a3.setId("3");
        a2.setCity("city");
        a2.setState("state");
        a2.setZipCode("12345");
        a3.setCity("city");
        a3.setState("state");
        a3.setZipCode("12345");
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
    public void canAddTest(){
        dao.addAddress(a1);
        assertEquals(1,dao.getAllAddresses().size());
    }
    @Test
    public void canAddNull(){
        dao.addAddress(null);
        assertEquals(0,dao.getAllAddresses().size());
    }
    
    @Test
    public void noAddress(){
        dao.addAddress(a1);
        assertEquals(0,dao.searchCity("notacity"));
        assertEquals(0,dao.searchLastName("notaLastName"));
        assertEquals(0,dao.searchState("notaState"));
        assertEquals(0,dao.searchZipCode("notAZip"));
    }
    
    @Test
    public void canGetNull(){
        try{
            dao.searchCity(null);
            fail();
        }catch(Exception e){
           
        }
        
    }
    @Test
    public void canRemoveNull(){
        try{
            dao.removeAddress(null);
            fail();
        }catch(Exception e){
            
        }
    }
    @Test
    public void canRemoveFalseAddress(){
        try{
            dao.removeAddress(a1);
            fail();
        }catch(Exception e){
            
        }
    }
    @Test
    public void canGetLastName(){
        a2.setLastName(a1.getLastName());
        a3.setLastName("notLast");
        dao.addAddress(a1);
        dao.addAddress(a2);
        dao.addAddress(a3);
        List<Address> list = new ArrayList<>();
        
        list.add(a1);
        list.add(a2);
        
        assertEquals(list,dao.searchLastName(a1.getLastName()));
    }
     @Test
    public void canGetCity(){
        a2.setCity(a1.getCity());
        a3.setCity("notLast");
        dao.addAddress(a1);
        dao.addAddress(a2);
        dao.addAddress(a3);
        List<Address> list = new ArrayList<>();
        
        list.add(a1);
        list.add(a2);
        
        assertEquals(list,dao.searchCity(a1.getCity()));
    }
     @Test
    public void canGetState(){
        a2.setState(a1.getState());
        a3.setState("notstate");
        dao.addAddress(a1);
        dao.addAddress(a2);
        dao.addAddress(a3);
        assertEquals(2,dao.searchState(a1.getState()).size());
    }
     @Test
    public void canGetZip(){
        a2.setZipCode(a1.getZipCode());
        a3.setZipCode("notLast");
        dao.addAddress(a1);
        dao.addAddress(a2);
        dao.addAddress(a3);
        List<Address> list = new ArrayList<>();
        
        list.add(a1);
        list.add(a2);
        
        assertEquals(list,dao.searchZipCode(a1.getZipCode()));
    }    
}
