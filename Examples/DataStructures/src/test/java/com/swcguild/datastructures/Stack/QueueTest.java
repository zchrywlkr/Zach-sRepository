/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.Stack;

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
public class QueueTest {
    Queue q = new Queue();
    
    public QueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
    public void testAddremove(){
        q.push("1");
        q.push("2");
        q.push("3");
        q.push("4");
        q.push("5");
        q.push("6");
        q.push("7");
        q.push("8");
        q.push("9");
        
//        System.out.println(q.pop());
//        q.push("10");
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
        
        for(Object o: q){
            System.out.println(o);
        }
        q.pop();
        q.pop();
        q.pop();
        for(Object o: q){
            System.out.println(o);
        }
        
    }
    @Test 
    public void testadd(){
        q.push("1");
        assertEquals(1,q.numItems);
    }
    @Test
    public void testRemove(){
        q.push("1");
        q.pop();
        assertEquals(0,q.numItems);
        
    } 
    
    @Test
    public void testIterator(){
        
        q.push(1);
        q.push(2);
        q.push(3);
        int count =1;
        for(Object s: q){
            assertEquals(count,s);
            count++;
        }
        
    }
}
