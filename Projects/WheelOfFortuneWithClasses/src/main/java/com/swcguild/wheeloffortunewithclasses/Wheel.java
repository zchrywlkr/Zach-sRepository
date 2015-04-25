
package com.swcguild.wheeloffortunewithclasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Wheel {
    int spin = 0;
    int winnings = 0;
    String spinResults = "";
    boolean wonMoney;
    boolean bankrupt;
    boolean loseTurn;
    boolean freePlay;
    
    public boolean getWonMoney() {
        return wonMoney;
    }
    

    public int getWinnings() {
        return winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }
    
    public void spin(){
         bankrupt=false;
         loseTurn = false;
         freePlay = false;
        winnings = 0; 
        Random r = new Random();
        spin = 1+r.nextInt(25);
        if(spin < 7){
            winnings = 300;
        }else if(spin < 11){
            winnings = 500;
        }else if(spin< 15){
            winnings = 700;
        }else if(spin < 18){
            winnings = 800;
        }else if(spin < 19){
            winnings = 500;
        }else if(spin < 21){
            bankrupt = true;
        }else if(spin < 23){
            loseTurn = true;
        }else{
            freePlay = true;
        }
        if(winnings != 0){
            System.out.println("\r you hit :" + winnings);
            wonMoney = true;
        }else{
            if(bankrupt){System.out.println("bankrupt");}
            if(loseTurn){System.out.println("loseturn");}
            if(freePlay){winnings = 500; System.out.println("Freeplay you can guess consonate for $500 per occurance \n call a free voewl\n or try to solve the puzzle with no penalty");}
            wonMoney = false;
        }
        
        
    }

    public boolean isBankrupt() {
        return bankrupt;
    }

    public boolean isLoseTurn() {
        return loseTurn;
    }

    public boolean isFreePlay() {
        return freePlay;
    }
    

    
}
