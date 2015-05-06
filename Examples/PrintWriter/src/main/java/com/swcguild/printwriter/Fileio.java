/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class Fileio {
    
    public static void main(String[] args) {
            PrintWriter out = null;
        try{

            out = new PrintWriter(new FileWriter("OutFile.txt"));
            out.println("this is a line in my file.....");
            out.println("a second line in my file........");
            out.println("a third line in my file.......");
            out.flush();
            
            }catch(Exception e){
                System.out.println(e);
                System.out.println("test");
            }finally{
                if(out != null){
                   out.close();
                }
                
        };
    }
    
}
