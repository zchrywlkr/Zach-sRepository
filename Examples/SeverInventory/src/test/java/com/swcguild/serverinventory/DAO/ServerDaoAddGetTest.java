/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.DAO;

import com.swcguild.serverinventory.DTO.Server;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class ServerDaoAddGetTest {
    ServerDao dao;
    Server s1;
    Server s2;
    Server s3;
    
    public ServerDaoAddGetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s1 = new Server();
        s1.setName("test1");
        s1.setIp("130.45.34.210");
        s1.setMake("dell");
        s1.setNumProcessors(23);
        s1.setPurchaseDate(LocalDate.now());
        s1.setRam("256GB DDR");
        
        s2 = new Server();
        s2.setMake("dell");
        s2.setIp("45.125.35.256");
        s2.setName("tst2");
        s2.setNumProcessors(2);
        s2.setPurchaseDate(LocalDate.now());
        s2.setRam("256 GB");
        s3 = new Server();
        s3.setName("3");
        s3.setIp("23.32.23.122.244");
        s3.setNumProcessors(24);
        s3.setPurchaseDate(LocalDate.now());
        s3.setRam("64GB DDR");
        s3.setMake("notdell");
        dao = new ServerDaoInMemImpl();
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
    public void getNonExistenServer(){
        //make sure when i ask for somthing from an empty Da i get nothing back
        assertNull(dao.getServer("get"));
        dao.addServer(s1);
        assertNull(dao.getServer("notaserver"));
    }
    
    @Test
    public void addGetTest(){
        dao.addServer(s1);
        
        assertEquals(s1,dao.getServer(s1.getName()));
        
        dao.addServer(s2);
        dao.addServer(s3);
        
        assertEquals(s2,dao.getServer(s2.getName()));
        assertEquals(s3,dao.getServer(s3.getName()));
        
    }
    @Test
    public void canGetManu(){
        dao.addServer(s1);
        dao.addServer(s2);
        dao.addServer(s3);
        
        
        assertEquals(2,dao.getManufacturer(s1.getMake()).size());
        
    }
    //----------------------------------------------------------------------
//    @Test
//    public void canAddServerNull(){
//        dao.addServer(null);
//        assertEquals(0,dao.getAllServers().size());
//    }
//    @Test
//    public void canAddServer(){
//        dao.addServer(s1);
//        assertEquals(1,dao.getAllServers().size());
//        assertEquals(s1,dao.getServer("test1"));
//    }
//    @Test
//    public void canGetAll(){
//        dao.addServer(s1);
//        dao.addServer(s2);
//        dao.addServer(s3);
//        
//        assertEquals(3,dao.getAllServers().size());
//    }
//    @Test
//    public void canRemoveServerNull(){
//        dao.addServer(s1);
//        try{
//            dao.removeServer(null);
//        }catch(Exception e){ 
//        }
//        assertEquals(1,dao.getAllServers().size());
//    }
//    @Test
//    public void canRemoveServer(){
//        dao.addServer(s1);
//        dao.removeServer(s1);
//        assertEquals(0,dao.getAllServers().size());
//    }
//    @Test
//    public void canRemoveNonExistingServer(){
//        dao.addServer(s1);
//        try{
//            dao.removeServer(s2);
//        }catch(Exception e){
//            
//        }
//        assertEquals(1,dao.getAllServers().size());
//    }
//    @Test
//    public void canGetServerNull(){
//        s3.setName(null);
//        try{
//            s2= dao.getServer(null);
//            fail();
//        }catch(Exception e){
//        }
//    }
//    public void canGetEmptyString(){
//        dao.addServer(s1);
//        dao.addServer(s2);
//        try{
//            s3=dao.getServer("");
//            fail();
//        }catch(Exception e){       
//        }
//    }
//    @Test
//    public void canGetServerNameNotExist(){
//        
//        try{
//            dao.getServer(s3.getName());
//            fail();
//        }catch(Exception e){   
//        }
//    }
//    
}
