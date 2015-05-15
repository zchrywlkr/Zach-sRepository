/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.Stack;

/**
 *
 * @author apprentice
 */
public class ArrayStackDriver {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        
        for(Object o: stack){
            System.out.println(o);
        }
    }
    
}
