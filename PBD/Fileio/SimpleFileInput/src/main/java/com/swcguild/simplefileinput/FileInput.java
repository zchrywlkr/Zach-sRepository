/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.simplefileinput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new BufferedReader(new FileReader("zach.txt")));
        
        
        System.out.println(sc.nextLine());
    }
    
}
