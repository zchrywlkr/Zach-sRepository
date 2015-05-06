/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.methodexample;

/**
 *
 * @author apprentice
 */
public class Methods {
    public static void main(String[] args) {
        printHi();
        System.out.println(calcPi());
        System.out.println(add(5,2));
        int num1 = 10;
        int num2 = 5;
        int sum = add(num1,num2);
        System.out.println(sum);
    }
    public static void printHi(){
        System.out.println("hi");
    }
    public static double calcPi(){
        return 3.14159;
    }
    public static int add1And1(){
        return 1+1;
    }
    public static int add1And2(){
        return 1+2;
    }
    public static int add(int a, int b){
        return a+b;
    }
}
