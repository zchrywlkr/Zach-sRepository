/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.dao;

import com.swcguild.serverinventory.dto.Server;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author warde
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
        dao = new ServerDaoInMemImpl();

        s1 = new Server();
        s1.setName("TEST SERVER 1");
        s1.setIp("130.45.34.210");
        s1.setMake("Dell");
        s1.setNumProcessors(16);
        s1.setPurchaseDate(LocalDate.now());
        s1.setRam("256GB DDR");

        s2 = new Server();
        s2.setName("TEST SERVER 2");
        s2.setIp("140.42.33.9");
        s2.setMake("Dell");
        s2.setNumProcessors(24);
        s2.setPurchaseDate(LocalDate.now());
        s2.setRam("64GB DDR");

        s3 = new Server();
        s3.setName("TEST SERVER 3");
        s3.setIp("149.78.45.22");
        s3.setMake("HP");
        s3.setNumProcessors(8);
        s3.setPurchaseDate(LocalDate.now());
        s3.setRam("16GB DDR");

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
    public void getNonExistentServer() {
        // make sure when I ask for something from an empty DAO I get nothing
        // back
        Server testServer = dao.getServer(7);
        assertNull(testServer);

        // make sure when I ask for a non existent server from a non-empty
        // DAO I get nothing back
        dao.addServer(s1);
        testServer = dao.getServer(7);
        assertNull(testServer);
    }

    @Test
    public void addGetServerTest() {
        dao.addServer(s1);
        Server fromDao = dao.getServer(s1.getId());
        assertEquals(s1, fromDao);
        
        dao.addServer(s2);
        dao.addServer(s3);
        
        fromDao = dao.getServer(s1.getId());
        assertEquals(s1, fromDao);
        
        fromDao = dao.getServer(s2.getId());
        assertEquals(s2, fromDao);
        
        fromDao = dao.getServer(s3.getId());
        assertEquals(s3, fromDao);
         
    }
}
