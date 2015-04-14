/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.adumbcalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ADumbCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your first number:");
        double number1 = sc.nextDouble();
        System.out.print("what is your seccond number:");
        double number2 = sc.nextDouble();
        System.out.print("what is your third number:");
        double number3 = sc.nextDouble();
        System.out.println("("+number1+"+"+number2+"+"+number3+")"+" / 2...is "+((number1+number2+number3)/2));
    }
    
}
