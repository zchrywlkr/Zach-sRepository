/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.letterrevisited;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author apprentice
 */
public class Letter {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("letter.txt"));
        out.println("+----------------------------------------+");
        out.println("|                                     ###|");
        out.println("|                                    ####|");
        out.println("|                     zach               |");
        out.flush();
        out.close();
        
    }
    
}
