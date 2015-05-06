/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasicsskillcheck;

/**
 *
 * @author apprentice
 */
public class Adder {

    public static void main(String[] args) {

        System.out.println(adder(1, 1));
        System.out.println(adder(2, 3));
        System.out.println(adder(5, 8));
        System.out.println(adder(95, 42));
        

    }

    public static int adder(int num1, int num2) {

        return (num1 + num2);

    }
}
