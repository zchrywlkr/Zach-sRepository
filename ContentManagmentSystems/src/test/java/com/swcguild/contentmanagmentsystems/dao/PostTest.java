/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.dao;

import com.swcguild.contentmanagmentsystems.Dao.PostDao;
import com.swcguild.contentmanagmentsystems.dto.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
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
public class PostTest {
    PostDao dao;
    Post p1 = new Post();
    
    
    public PostTest() {
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
        dao = ctx.getBean("Dao",PostDao.class);
        
         JdbcTemplate cleaner = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
         
         cleaner.execute("delete from category_post");
         cleaner.execute("delete from post");
         cleaner.execute("delete from category");
         
         p1.setTitle("title");
         p1.setBody("body");
         p1.setUserId(1);
         Date date = new Date(System.currentTimeMillis());
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         String dateStr = sdf.format(date);
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException ex) {
            Logger.getLogger(PostTest.class.getName()).log(Level.SEVERE, null, ex);
        }
         p1.setDate(date);
         
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
    public void testPost(){
        dao.addPost(p1);
        
    }
    
    @Test
    public void testgetPost(){
        dao.addPost(p1);
       assertEquals(p1,dao.getPost(p1.getPostId()));
    }
    
//    @Test 
//    public void addCategorysToPost(){
//        List<String> list = new ArrayList<>();
//        list.add("4");
//        list.add("5");
//        dao.addPost(p1,list);
//        
//    }
    
//    @Test
//    public void getCategoriesDescription(){
//          List<String> list = new ArrayList<>();
//        list.add("4");
//        list.add("5");
//        dao.addPost(p1,list);
//        
//        List<String> cat = new  ArrayList<>();
//        
//        cat = dao.getCategories(p1);
//        assertEquals(2, cat.size());
//    }
//    
//    @Test
//    public void getCategoriesWithIndex(){
//        Map<Integer,String> map = dao.getCategoriesWithIndex();
//        
//        assertEquals(2, map.values().size());
//        for(Entry set : map.entrySet()){
//            System.out.println(set.getKey());
//            System.out.println(set.getValue());
//            System.out.println();
//        }
//        
//    }
//    @Test
//    public void getCategories(){
//        List<Integer> list = new ArrayList<>(dao.getCategoriesWithIndex().keySet());
//    }
//    
//    @Test
//    public void addTagGetTagTest(){
//        List<String> list = new ArrayList<>();
//        list.add("firstTage");
//        list.add("second tag");
//        List<String> cat = new ArrayList<>();
//        cat.add("4");
//        cat.add("5");
//        dao.addPost(p1, cat);
//        dao.addTag(list, p1);
//        
//        List<String> testList = dao.getTagsForPost(p1);
//        
////        assertEquals(2, testList.size());
//    }
//    
//    
//    @Test
//    public void getPostByDate(){
//        dao.addPost(p1);
//        dao.addPost(p1);
//        dao.addPost(p1);
//        dao.addPost(p1);
//        dao.addPost(p1);
//        dao.addPost(p1);
//        
//        
//        assertEquals(5,dao.getPostsByLastDates(5).size());
//        
//        
//    }
//    
//    @Test
//    public void deleteTest(){
//        dao.addPost(p1);
//        dao.deletePost(p1.getPostId());
//        
//       assertEquals(0,dao.getPostsByLastDates(5).size());
//    }
//    
//    @Test
//    public void testOccurence(){
//        dao.addCategory("1");
//        dao.addCategory("2");
//        dao.addCategory("3");
//        dao.addCategory("4");
//        dao.addCategory("5");
//        dao.addCategory("6");
//        
//          Map<Integer,String> map = dao.getCategoriesWithIndex();
//        
//          List<Integer> list = new ArrayList(map.keySet());
//          
//          List<Integer> list2 = new ArrayList<>();
//          
//          for(int i =0; i<5;i++){
//              
//              list2.add(list.get(i));
//              
//          }
//          
//          Map<Integer,String> map2 = dao.getCategoriesByOccurence();
//    }
    
    @Test
    public void testGetTagByOccurence(){
        dao.getTagByOccurence();
    }
}
