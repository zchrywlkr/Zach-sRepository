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
public class ArrayStack implements Stack {

    private Object[] items;
    private static final int DEFAULT_INITIAL_SIZE = 4;
    int numItems;

    public ArrayStack(int size) {
        items = new Object[size];
    }

    public ArrayStack() {
        this(DEFAULT_INITIAL_SIZE);
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
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
        items[numItems++] = item;
    }

    @Override
    public Object pop() {
        Object item = items[--numItems];
        items[numItems] = null;

        if (numItems == items.length / 4) {
            resize(items.length / 2);
        }
        return item;
    }

    private void resize(int newSize) {
        Object[] temp = new Object[newSize];
        for (int i = 0; i < numItems; i++) {
            temp[i] = items[i];
        }
        
        items = temp;
    }

    @Override
    public Iterator iterator() {

    return new ReverseArrayIterator();
    }
    
    
     private class ReverseArrayIterator implements Iterator {
         private int i=numItems;
         

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Object next() {
            return items[--i];
        }

    }
    
}
