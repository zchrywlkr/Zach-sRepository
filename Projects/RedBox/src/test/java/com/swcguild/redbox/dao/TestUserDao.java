/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.User;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author apprentice
 */
public class TestUserDao {
    
    UserDao dao;
    User u1;
    User u2;
    User u3;
    User u4;
    
    public TestUserDao() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("Dao", UserDao.class);
        JdbcTemplate cleaner = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
        cleaner.execute("delete from orders");
        cleaner.execute("delete from inventory");
        cleaner.execute("delete from user");
        cleaner.execute("delete from dvd");
        u1 = new User();
        u1.setFirstName("first");
        u1.setLastName("last");
        u1.setStreet("street");
        u1.setCity("city");
        u1.setState("state");
        u1.setZip("zip");
        u1.setCreditCard("111111111");
    }
    
    @After
    public void tearDown() {
    }

//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
    
//     @Test
//     public void hello() {}
    
    @Test
    public void testAddGetAll(){
        dao.addUser(u1);
        assertEquals(1,dao.listAllUsers().size());
    }
    
    @Test
    public void testGet(){
        dao.addUser(u1);
        assertEquals(u1,dao.getUserById(u1.getId()));
    }
    
    @Test
    public void testDelete(){
        dao.addUser(u1);
        dao.remove(u1.getId());
        assertEquals(0, dao.listAllUsers().size());
        
    }
    
    @Test
    public void testGetByCard(){
        dao.addUser(u1);
        assertEquals(u1,dao.getByCreditCard(u1.getCreditCard()));
    }
    
}
