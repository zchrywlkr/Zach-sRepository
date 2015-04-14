/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.moreuserinputofdata;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MoreUserInputData {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First name:");
        String firstName = sc.nextLine();
        System.out.print("Last name:");
        String lastName = sc.nextLine();
        System.out.print("Grade:");
        String grade = sc.nextLine();
        System.out.print("Student id:");
        String id = sc.nextLine();
        System.out.print("Login:");
        String login = sc.nextLine();
        System.out.print("GPA:");
        String gpa = sc.nextLine();
        
        System.out.println("\rYour info");
        System.out.println("\tLogin: "+ login);
        System.out.println("\tID: "+ id);
        System.out.println("\tName: "+ firstName + " " + lastName);
        System.out.println("\tGPA: "+ gpa );
        System.out.println("\tgrade: "+ grade );
        
    }
    
}
