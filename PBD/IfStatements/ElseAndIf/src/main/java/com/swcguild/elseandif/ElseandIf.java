/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.elseandif;

/**
 *
 * @author apprentice
 */
public class ElseandIf {
    public static void main(String[]args){
        
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        if (cars > people){
            System.out.println("We should take the cars.");
        }else if(cars < people){
            System.out.println("we should not take the cars ");
        }else{
            System.out.println("We cant decide.");
        }
        
        if(buses > cars){
            System.out.println("thats too many buses");
        }else if (buses < cars){
            System.out.println("Maybe we could take the buses");
        }else{
            System.out.println("we still cant decide");
        }
        
        if(people >buses){
            System.out.println("All right, lets just take the buses");
        }else{
            System.out.println("Fine, lets stay home then");
        }
    }
    
}
