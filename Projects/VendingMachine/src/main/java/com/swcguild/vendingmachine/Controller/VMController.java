/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine.Controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.vendingmachine.dao.Change;
import com.swcguild.vendingmachine.dao.VendingMachine;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class VMController {
    ConsoleIO io = new ConsoleIO();
    VendingMachine vending = new VendingMachine();
    
    public void run() throws FileNotFoundException, IOException{
        vending.load();
        boolean exit = false;
        String userInput ="";
        double money =0;
        double cost =0;
        do {
            money=io.scanDouble(printMenu() +"enter money");
            if(money == 0){
                break;
            }
            userInput = io.scanString("enter item");
            cost = selectItem(userInput,money);
            makeChange(money - cost);
            money -= cost;
            
        } while (!exit);  
        vending.save();
    }
    private String printMenu() {
        
        return ("Vending Machine \r 0) exit\r" + vending.printInventory() );
    }

    private double selectItem(String userInput,double money) {
        int input = Integer.parseInt(userInput);
        if((vending.getInventory().get(input).getNumber() > 0)&&(money>vending.getInventory().get(input).getCost())){
            return vending.buy(input);
        }else if(money>vending.getInventory().get(input).getCost()){
            io.printString("not enough money");
            return 0;
        }else{
            io.printString("out of stock");
            return 0;
        }
        
    }
    private void makeChange(double change) {
        io.printString("your change is: " + Change.makeChange(change));
        
    }
}
