/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.creditcardcheck;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CreditCardCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = "";
        String cardType = "";
        int digits = 0;
        
        boolean valid = true;
        
        do {
            System.out.println("Please enter card type (Visa, Mastercard, American Express or Discover)");
            cardType = sc.nextLine();
            digits = cardType(cardType);//returns number of digits for card
            
        } while (digits==0);
        
        do {
            System.out.println("enter card number");
            card = sc.nextLine();
            valid = validNumber(card,digits);
        } while (!valid);
        
        
        valid = luhnAlgorithm(card,digits);
        if(valid){
            System.out.println("credit cards good");
        }else{
            System.out.println("declined");
        }
        
    }
    
    public static boolean validNumber(String card,int digits){
        double cardNumber = 0;
        boolean valid = true;
        
        try{
            cardNumber = Double.parseDouble(card);
            if(card.length()!= digits){
                System.out.println("invalid number");
                valid = false;
            }else{
                valid = true;
            }
        }
        catch(Exception e){
            System.out.println("invalid number");
            valid = false;
        }
            
        
        return valid;
    }
 
    public static boolean luhnAlgorithm(String card, int digits){
        Integer cardNumber[] = new Integer[digits];
        int checkDigit = Integer.parseInt(Character.toString(card.charAt(digits-1)));
        int sum = 0;
        int testDigit = 0;
        for(int i = (digits-1); i > 0; i --){
            cardNumber[i]= Integer.parseInt(Character.toString(card.charAt(i)));
            if(i%2==0){
                cardNumber[i] += cardNumber[i];
                if(cardNumber[i]>9){
                    cardNumber[i]= (cardNumber[i] /10) +1;
                }
            }
            sum += cardNumber[i];
        }
        testDigit = (sum*9)%10;
        System.out.println("test digit" + testDigit);
        System.out.println("check digit " + checkDigit);
        
        if(testDigit==checkDigit){
            return true;
        }else{
            return false;
        }
    }
    
    public static int cardType(String cardType){
        int length = 0;
        Scanner sc = new Scanner(System.in);
        switch(cardType){
            case "MasterCard": return 16;
            case "Visa": 
                System.out.println("13 or 16 digits");
                length = sc.nextInt();
                sc.nextLine();
                return length;
            case "American Express": return 15;  
            case "Discover" : return 16;
            default: return 0;
        }
        
    }
}
