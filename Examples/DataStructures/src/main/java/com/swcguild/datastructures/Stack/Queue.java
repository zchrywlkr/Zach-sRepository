/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.Stack;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class Queue implements Stack{
    private Object[] items;
    private static final int DEFAULT_INITIAL_SIZE = 4;
    int numItems = 0;
    int index = 0;
    int removeIndex = 0;
    

    public Queue() {
        this(DEFAULT_INITIAL_SIZE);
    }
    public Queue(int num) {
        items = new Object[num];
        
        
    }

    @Override
    public boolean isEmpty() {
        return numItems==0;
    }

    @Override
    public int size() {
        return numItems;
    }
    @Override
    public void push(Object item) {
          if (numItems == items.length) {
            resize(2 * items.length);
        }
        items[index++ % items.length] = item;
        numItems++;
    }

    @Override
    public Object pop() {
        Object item = items[removeIndex];
        items[removeIndex % items.length] = null;
        removeIndex++;
        numItems--;
        

        if (numItems == items.length / 4) {
            resize(items.length / 2);
        }
        return item;
        
    }

    @Override
    public Iterator iterator()  {
        return new QueueIterator();
    }

    private void resize(int newSize) {
         Object[] temp = new Object[newSize];
        for (int i = removeIndex,j=0; j < numItems; i++,j++) {
            if(i == items.length){
                i=0;
            }
            temp[j] = items[i];
        }
        items = temp;
        index = numItems ;
        removeIndex = 0;
    }
    
    private class QueueIterator implements Iterator {
         private int i=removeIndex;
        @Override
        public boolean hasNext() {
            return i!=index;
        }

        @Override
        public Object next() {
            if(i==items.length){
                i=0;
            }
            return items[i++];
        }

    }
    
}
