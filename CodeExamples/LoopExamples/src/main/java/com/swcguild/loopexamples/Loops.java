
package com.swcguild.loopexamples;

import java.util.Scanner;

/**
 *
 * @author warde
 */
public class Loops {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favoriteTeam = "";
        do {
            System.out.println("Please enter your favorite team:");
            favoriteTeam = sc.nextLine();           
        } while (!favoriteTeam.equals("Browns"));
        
        int userNumber = 0;
        System.out.println("Please enter a number:");
        userNumber = sc.nextInt();
        
        while (userNumber < 10 && userNumber >= 0) {
            System.out.println(userNumber--);
        }
        
        System.out.println("Please enter another number:");
        userNumber = sc.nextInt();
        for (int i = userNumber; i >= 0; i--) {
            System.out.println(i);
        }
        
    }

}
