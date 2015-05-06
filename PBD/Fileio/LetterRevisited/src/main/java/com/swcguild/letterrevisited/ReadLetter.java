/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.letterrevisited;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ReadLetter {
    public static void main(String[] args) throws FileNotFoundException {
        String userInput ="";
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter file name");
        userInput = sc2.nextLine();
        Scanner sc = new Scanner(new BufferedReader(new FileReader(userInput)));
        
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    
}
