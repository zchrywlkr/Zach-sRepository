/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.whatif;

/**
 *
 * @author apprentice
 */
public class WhatIf {
    public static void main(String[]args){
        int people = 20;
        int cats = 20;
        int dogs = 15;
        /*
        1. The if statements enable to the code below them to run if true
        2.curly braces encompass the exacutable code after the if statemen
        */
        
        if (people < cats)
        {
            System.out.println("Too many cats! the world is doomed!");
        }
        if (people > cats)
        {
            System.out.println("Not many cats! the world is saved!");
        }
        if (people < dogs)
        {
            System.out.println("The world is drooled on!");
        }
        if (people > dogs)
        {
            System.out.println("The world is dry");
        }
        dogs +=5;
        
        if (people >= dogs)
        {
            System.out.println("people are greater thean or eqaul to dogs");
        }
        if (people <= dogs)
        {
            System.out.println("People are less than or equal to dogs");
        }
        if (people == dogs)
        {
            System.out.println("People are dogs");
        }
            
    }
    
}
