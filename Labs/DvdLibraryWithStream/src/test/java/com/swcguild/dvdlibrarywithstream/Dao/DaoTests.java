/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstream.Dao;
import com.swcguild.dvdlibrarywithstream.Dto.Dvd;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author apprentice
 */
public class DaoTests {
    DvdDao dao ;
    Dvd d1;
    Dvd d2;
    Dvd d3;
    public DaoTests() {
    }
    @BeforeClass
    public static void setUpClass() {   
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
       dao = new DvdDaoDummyImpl();
       d1= new Dvd();
       d2 = new Dvd();
       d3 = new Dvd();
       d1.setId("1");
       d2.setId("2");
       d3.setId("3");   
       d1.setReleaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
      d3.setReleaseDate(LocalDate.parse("2013-01-01", DateTimeFormatter.ISO_DATE));
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
    public void canAddNull(){
        dao.addDvd(null);
        assertEquals(0,dao.getAllDvds().size());
        
    }
    @Test
    public void canAddGetDvd(){
        dao.addDvd(d1);
        assertEquals(d1,dao.getDvd(d1.getId()));
        
        dao.addDvd(d2);
        dao.addDvd(d3);
        assertEquals(d2,dao.getDvd(d2.getId()));
        assertEquals(d3,dao.getDvd(d3.getId()));
    }
    @Test
    public void canGetEmptyList(){
        dao.addDvd(d1);
        assertEquals(0,dao.findDirector(d1.getDirector()+"not").size());
        assertEquals(0,dao.findMpaaRating(d1.getMpaa()+"not").size());
        assertEquals(0,dao.findStudio(d1.getStudio()+"not").size());       
    }
    @Test
    public void addRemoveTest(){
        dao.addDvd(d1);
        dao.addDvd(d2);
        dao.addDvd(d3);
        assertEquals(3,dao.getAllDvds().size());
        dao.removeDvd(d1);
        assertNull(dao.getDvd(d1.getId()));
        assertEquals(2,dao.getAllDvds().size());
    }
    @Test
    public void canGetDirector(){
        d1.setDirector("1");
        d2.setDirector(d1.getDirector());
        d3.setDirector("3");
        d1.setMpaa("1");
        d2.setMpaa("2");
        dao.addDvd(d1);
        dao.addDvd(d2);
        dao.addDvd(d3);
        assertEquals(2, dao.findDirector(d1.getDirector()).size());
        assertEquals(1,dao.findDirector(d1.getDirector()).get(d1.getMpaa()).size());
    }
    @Test
        public void canGetmpaa(){
        d1.setMpaa("1");
        d2.setMpaa(d1.getMpaa());
        d3.setMpaa("3");
        dao.addDvd(d1);
        dao.addDvd(d2);
        dao.addDvd(d3);
        assertEquals(2, dao.findMpaaRating(d1.getMpaa()).size());   
    }
        @Test
        public void canGetStudio(){
        d1.setStudio("1");
        d2.setStudio(d1.getStudio());
        d3.setStudio("3");
        dao.addDvd(d1);
        dao.addDvd(d2);
        dao.addDvd(d3);
        assertEquals(2, dao.findStudio(d1.getStudio()).size());
    }
        
        @Test
        public void canGetOldest(){
            dao.addDvd(d1);
            dao.addDvd(d3);
            
            assertEquals(d1,dao.getOldest().get(0));
        }
           @Test
        public void canGetNewst(){
            dao.addDvd(d1);
            dao.addDvd(d3);
            
            assertEquals(d3,dao.getNewestMovie().get(0));
        }
        @Test
        public void canAverageNoteLength0(){
            dao.addDvd(d1);
            dao.addDvd(d2);
            dao.addDvd(d3);
            assertEquals(0,dao.getAverageNumNotes(),0);
            
        }
}
