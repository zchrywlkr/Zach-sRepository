/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.Dvd;
import com.swcguild.redbox.dto.Order;
import com.swcguild.redbox.dto.User;
import java.util.ArrayList;
import java.util.List;
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
public class TestOrders {
     RedBoxDao dao;
    Order o1;
    Order o2;
    Order o3;
    User u1;
    Dvd m1;
    
    public TestOrders() {
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
        dao = ctx.getBean("Dao",RedBoxDao.class);
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
        
        m1 = new Dvd();
        m1.setInventory(3);
        m1.setMpaa("1");
        m1.setNotes("note");
        m1.setRelease("12/13/1989");
        m1.setStudio("studio");
        m1.setTitle("title");
        m1.setTrailer("trailer");
        m1.setCover("cover");
        m1.setRating(1);
        m1.setDirector("dir");
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        m1.setGenres(list);
        
        dao.addMovie(m1);
        dao.addUser(u1);
        
        dao.setInventory(m1);
        
        o1 = new Order();
//        o1.setUserId(u1.getId());
//        o1.setInventoryId(dao.getInventory(m1.getId()));
//        BigDecimal bd = new BigDecimal(1.0);
//        o1.setPrice(1);
//        o1.setStart("6/1/2015");
        
        o1=dao.makeOrder(dao.getInventory(m1.getId()), u1.getId());
        
        
        
        
        
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
    public void testAdd(){
        dao.addOrder(o1);
        
        
    }
    
    @Test
    public void testGetOrder(){
        dao.addOrder(o1);
        dao.getOrder(o1.getId());
        assertEquals(o1,dao.getOrder(o1.getId()));
    }
    
    @Test
    public void testGetbyUser(){
        dao.addOrder(o1);
        List<Order> list = dao.getOrdersByUser(u1.getId());
        assertEquals(1,list.size());
    }
    
    @Test
    public void testgetAllOrders(){
        dao.addOrder(o1);
        assertEquals(1,dao.listAllOrders().size());
        
    }
    
    @Test
    public void testRemove(){
        dao.addOrder(o1);
        dao.removeOrder(o1.getId());
        assertEquals(0,dao.listAllOrders().size());
    }
    
    
    
}
