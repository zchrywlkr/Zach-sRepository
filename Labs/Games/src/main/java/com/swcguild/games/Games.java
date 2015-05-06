/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.games;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.games.wof.WheelOfFortune;
import java.io.FileNotFoundException;

/**
 *
 * @author apprentice
 */
public class Games {
    
    public static void run() throws FileNotFoundException{
        LuckySevens luck = new LuckySevens();
        Rps rps = new Rps();
        TicTacToe ttt = new TicTacToe();
        WheelOfFortune wof = new WheelOfFortune();
        ConsoleIO io = new ConsoleIO();
        
        String input = "";
        boolean run = true;
        do {
        io.printString("Choose your game\r\t1) "+luck.name()+"\r\t2) "+rps.name()+"\r\t3) " + ttt.name()+"\r\t4) "+ wof.name()+"\r\t5) exit");
            io.scanString("");
            input = io.scanString("");
            switch(input){
                case "1" : luck.run();break;
                    case"2": rps.run(); break;
                    case "3": ttt.run(); break;
                    case "4" : wof.run(); break;
                    case "5" : run = false; break;
                    default : io.printString("unkown input");
            }
   
        } while (run);
        
        
    }
    
}
