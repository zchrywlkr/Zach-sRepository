/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.Dvd;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
public class TestMovieDao {
    MovieDao dao;
    Dvd m1 = new Dvd();
    Dvd m2 = new Dvd();
    Dvd m3 = new Dvd();
    Dvd m4 = new Dvd();
    Dvd m5 = new Dvd();
    Dvd m6 = new Dvd();
    
    
    public TestMovieDao() {
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
        
        dao = ctx.getBean("Dao", MovieDao.class);
        JdbcTemplate cleaner = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
        cleaner.execute("delete from dvd");
        
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
        dao.addMovie(m1);
        assertEquals(1,dao.getAllMovies().size()); 
    }
    @Test
    public void testget(){
        dao.addMovie(m1);
        System.out.println(dao.getMovie(m1.getId()).getGenres().get(0));
        System.out.println(dao.getMovie(m1.getId()).getGenres().get(1));
        assertEquals(m1,dao.getMovie(m1.getId()));
        
    }
    @Test
    public void testGetGenreString(){
        dao.addMovie(m1);
        List<Integer> genres = dao.getMovie(m1.getId()).getGenres();
        
        List<String> genreString = dao.getGenres(genres);
        
        assertEquals(genreString.get(0),("Action"));
        assertEquals(genreString.get(1),"Adventure");
        
        
        for(String str: genreString){
            System.out.println(str);
        }    
    }
    @Test
    public void testDelete(){
        dao.addMovie(m1);
        dao.deleteDvd(m1.getId());
        assertEquals(dao.getAllMovies().size(), 0);
    }
    @Test
    public void testUpdate(){
        dao.addMovie(m1);
        String title = "new title";
        m1.setTitle(title);
        assertTrue(!dao.getMovie(m1.getId()).getTitle().equals(title));
        dao.editMovie(m1);
        assertEquals(title,dao.getMovie(m1.getId()).getTitle());
    }
}
