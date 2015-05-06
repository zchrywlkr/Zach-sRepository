/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.printwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */ 
public class Reader {
    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(new BufferedReader(new FileReader("utFile.txt")));
            while(sc.hasNextLine()){
            String currentline= sc.nextLine();
            System.out.println(currentline);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
           
        }
    }
}
