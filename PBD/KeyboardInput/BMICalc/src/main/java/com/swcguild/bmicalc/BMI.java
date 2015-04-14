/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.bmicalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BMI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Your height (feet ontly): ");
        Double feet = sc.nextDouble();
        System.out.print("Your height in inches: ");
        Double inches = sc.nextDouble();
        System.out.print("your weight in pounds: ");
        Double weight = sc.nextDouble();
        
        Double bmi = (.453592 * weight)/Math.pow((((feet*12)+inches)*.0254),2);
        System.out.println("Your BMI is " + bmi);
        
    }
    
}
