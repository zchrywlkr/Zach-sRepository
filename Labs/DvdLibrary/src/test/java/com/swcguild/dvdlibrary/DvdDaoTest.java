/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class DvdDaoTest {
    DvdLibraryDao dao;
    Dvd d1;
    Dvd d2;
    Dvd d3;
    Dvd dvd;
    public DvdDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        dao = ctx.getBean("dao",DvdLibraryDao.class);
        
        dvd = ctx.getBean("dvd1" , Dvd.class);
        
        d1 = new Dvd();
        d2 = new Dvd();
        d3 = new Dvd();
        d1.setId(1);
        d2.setId(2);
        d3.setId(3);
        d1.setDirector("dir");
        d1.setMpaaRating("mpaa");
        d1.setNote("note");
        d1.setReleaseDate("1");
        d1.setStudio("studio");
        d1.setTitle("title");
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
    public void testAddRemove(){
        assertEquals(0,dao.listAll().size());
        dao.add(d1);
        assertEquals(1,dao.listAll().size());
        dao.remove(d1.getId());
        assertEquals(0,dao.listAll().size());
    }
    @Test
    public void testGetTitle(){
        
        d1.setTitle("title");
        d2.setTitle(d1.getTitle()+"not");
        dao.add(d1);
        dao.add(d2);
  
        
        assertEquals(d1,dao.getByTitle(d1.getTitle()).get(0));
        
    }
    @Test
    public void testGetRating(){
        d1.setMpaaRating("mpaa");
        d2.setMpaaRating(d1.getMpaaRating()+"not");
        dao.add(d1);
        dao.add(d2);
        
        assertEquals(d1,dao.getByRating("mpaa").get(0));
    }
    @Test
    public void testGetStudio(){
        d1.setStudio("Studio");
        d2.setStudio(d1.getStudio()+"not");
        dao.add(d1);
        dao.add(d2);
        
        assertEquals(d1,dao.getByStudio("Studio").get(0));
    }    
        
    @Test
    public void testGetDvd(){
        dao.add(d1);
        assertEquals(d1,dao.getById(d1.getId()));
    }
 
}
