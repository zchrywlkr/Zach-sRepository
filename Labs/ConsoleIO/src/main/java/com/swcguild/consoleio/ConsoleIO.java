package com.swcguild.consoleio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author terry
 */
public class ConsoleIO {

    public int scanInt(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return Integer.parseInt(sc.nextLine());
    }

    public int scanInt(int min, int max, String string) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            try {
                System.out.println(string);
                num = Integer.parseInt(sc.nextLine());
                if (num < min || num > max) {
                    System.out.println("input must be more between " + min + " and " + max);
                }
            } catch (Exception e) {
                num = min - 1;
            }

        } while (num < min || num > max);

        return num;
    }

    public double scanDouble(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return Double.parseDouble(sc.nextLine());
    }

    public double scanDouble(double min, double max, String string) {

        Scanner sc = new Scanner(System.in);
        double num = 0;

        do {
            System.out.println(string);
            num = Integer.parseInt(sc.nextLine());
        } while (num < min || num > max);

        return num;
    }

    public float scanFloat(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return Float.parseFloat(sc.nextLine());
    }

    public float scanFloat(float min, float max, String string) {
        Scanner sc = new Scanner(System.in);
        float num = 0;

        do {
            System.out.println(string);
            num = Float.parseFloat(sc.nextLine());
        } while (num < min || num > max);

        return num;
    }

    public String scanString(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return sc.nextLine();
    }

    public void printString(String string) {
        System.out.println(string);
    }

    public String scanStringEdit(String string, String old, boolean keep) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        if (keep) {
            System.out.println("Hit enter to keep: \r" + old);
        }
        input = sc.nextLine();
        if (input.equals("") && keep) {
            return old;
        }
        return input;
    }

    public String scanIntAsString(int min, int max, String string , Boolean keep) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        String input ="";
        do {
            try {
                System.out.println(string);
                
                input = sc.nextLine();
                if(input.equals("")&& keep){
                    return "";
                }
                num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.out.println("input must be more between " + min + " and " + max);
                }
            } catch (Exception e) {
                num = min - 1;
            }

        } while (num < min || num > max);

        return String.valueOf(num);
    }
    
    public String scanDoubleAsString(double min,double max, String message, Boolean keep){
          Scanner sc = new Scanner(System.in);
        double num = 0;
        String input ="";
        do {
            try {
                System.out.println(message);
                
                input = sc.nextLine();
                if(input.equals("")&& keep){
                    return "";
                }
                num = Double.parseDouble(input);
                if (num < min || num > max) {
                    System.out.println("input must be more between " + min + " and " + max);
                }
            } catch (Exception e) {
                num = min - 1;
            }

        } while (num < min || num > max);

        return String.valueOf(num);
    }

    public LocalDate scanLocalDate(String str) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date;
        String input ="";
        
        boolean exit;
        do {
            try{
                exit = true;
                System.out.println(str);
                input = sc.nextLine();
                date = LocalDate.parse(input,dtf);
                return date;
            }catch(Exception e){
                exit = false;
                System.out.println("Bad input:  yyyy-mm-dd");
            }
         
            
        } while (!exit);
        
        return null;
        
    }

}
