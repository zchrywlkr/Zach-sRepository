/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.staticexample;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        
        System.out.println(Adder.add(1,2));
        AdderNonStaticMethod myAdder = new AdderNonStaticMethod();
        System.out.println(myAdder.add(1, 2));
        System.out.println(AdderStaticLibrary.add(2, 3));
        
        AdderStaticLibrary adding = new AdderStaticLibrary();
        System.out.println(adding.add(6,3));
    }
    
}
