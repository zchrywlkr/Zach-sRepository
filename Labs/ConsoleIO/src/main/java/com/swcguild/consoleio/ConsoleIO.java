package com.swcguild.consoleio;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class ConsoleIO {

    public  int scanInt(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return Integer.parseInt(sc.nextLine());
    }

    public  int scanInt(int min, int max,String string) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            
            System.out.println(string);
            num = Integer.parseInt(sc.nextLine());
        } while (num < min || num > max);

        return num;
    }

    public  double scanDouble(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return Double.parseDouble(sc.nextLine());
    }

    public  double scanDouble(double min, double max,String string) {
        
        Scanner sc = new Scanner(System.in);
        double num = 0;

        do {
            System.out.println(string);
            num = Integer.parseInt(sc.nextLine());
        } while (num < min || num > max);

        return num;
    }

    public  float scanFloat(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return Float.parseFloat(sc.nextLine());
    }

    public  float scanFloat(float min, float max,String string) {
        Scanner sc = new Scanner(System.in);
        float num = 0;

        do {
            System.out.println(string);
            num = Float.parseFloat(sc.nextLine());
        } while (num < min || num > max);

        return num;
    }

    public  String scanString(String string) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string);
        return sc.nextLine();
    }

    public  void printString(String string) {
        System.out.println(string);
    }
}
