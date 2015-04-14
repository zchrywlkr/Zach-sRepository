/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.windowmaster;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class windowMaster {
    
    public static void main(String[] args){
        double height = 0;
        double width = 0;
        double glassPrice = 3;
        double trimPrice=0;
        double total = 0;
        
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter hieght");
        String stringOp1 = sc.nextLine();
        System.out.println("enter width");
        String stringOp2 = sc.nextLine();
        System.out.println("enter price of glass");
        String stringGlass = sc.nextLine();
        System.out.println("enter trim price");
        String stringTrim = sc.nextLine();
        
        
        height = Double.parseDouble(stringOp1);
        width = Double.parseDouble(stringOp2);
        glassPrice = Double.parseDouble(stringGlass);
        trimPrice = Double.parseDouble(stringTrim);
        
        
        double windowCost = height*width* glassPrice;
        double trimCost = 2*(height+width) * trimPrice;
        
        total = trimCost + windowCost;
        System.out.println("the unit price of the window is " + glassPrice);
        System.out.println("the unti price of the trim is " + trimPrice);
        System.out.println("the window cost is $" + windowCost);
        System.out.println("the trim cost is $" + trimCost);        
        System.out.println("total: $" + total );
        
    }
}
    

