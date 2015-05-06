/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.application;

import com.swcguild.inheritanceexample.Employee;
import com.swcguild.inheritanceexample.Manager;
import com.swcguild.inheritanceexample.SummerIntern;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        Manager m = new Manager();
        Employee e ;
        SummerIntern s = new SummerIntern();
        e = new Manager();
        m.doWork();
        m.createObjective();
        e.doWork();
        e.createObjective();
        
        s.doWork();
        s.createObjective();
    }
}
