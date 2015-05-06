/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.interestcalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalc {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        double rate = 0;
        double money = 0;
        double years = 0;
        double intervalRate = 0;
        double beggining = 0;
        double currentYear = 0;
        String intervalString = "";
        double interval=0;
        
        System.out.println("enter interval yearly, quarterly, daily");
        intervalString = sc.nextLine();
        switch(intervalString){
            case "yearly": interval = 1; break;
            case "quarterly" :interval = 4; break;
            case "daily": interval = 365; break;
            case "monthly": interval = 12; break;
            default: interval = 1;    
        }
            
        do {
            System.out.println("enter investment amount");
            money = sc.nextDouble();
            
        } while (money < 0);
        
        do {
            System.out.println("enter rate ");
            rate = sc.nextDouble();
        } while (rate < 0);
        
        do {
            System.out.println("enter years");
            years = sc.nextDouble();
        } while (years < 0);
        
        
        intervalRate = rate/interval;
            
        do {
            System.out.println("money at begining of year " + money);
            beggining = money;
            for(int i=0;i<interval;i++){
           money = money *(1+(intervalRate/100));                       
       }
          System.out.println("total interest earned " + (money - beggining));
          System.out.println("money " + money);  
            System.out.println("year number "+ (2015 + currentYear));
          currentYear++;
        } while (currentYear < years);
        
    }
}
