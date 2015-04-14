
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class AgeInFiveYears {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your name");
        String name = sc.nextLine();
        System.out.print("\r\rHi " + name + " how old are you?");
        String stringAge = sc.nextLine();
        
        int age = Integer.parseInt(stringAge);
        System.out.print("\r\rDid you know in 5 years you will be "+ (age+5)+" years old?");
        System.out.print("\rFive years ago you were "+ (age-5) + " image that!\r");
        
        
    }
    
}
