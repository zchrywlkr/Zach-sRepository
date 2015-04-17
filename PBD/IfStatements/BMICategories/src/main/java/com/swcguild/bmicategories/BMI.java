/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.bmicategories;

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
        System.out.println("your bmi is " + bmi);
        if(bmi < 15){
            System.out.println("you are severerly underweight");
        }else if(bmi<16){
            System.out.println("your severely underweight");
        }else if(bmi < 18.4){
            System.out.println("underweight");
        }else if(bmi <24.9){
            System.out.println("your weight is normal");
        }else if(bmi < 29.9){
            System.out.println("overweight");
        }else if(bmi < 34.9){
            System.out.println("moderately obese");
        }else if(bmi < 39.9){
            System.out.println("severely obese");
        }else {
            System.out.println("Very severely obese" );
        }
        
        
        
        
    }
    
}
