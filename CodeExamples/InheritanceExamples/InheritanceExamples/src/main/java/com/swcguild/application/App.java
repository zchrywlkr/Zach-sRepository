/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.application;

import com.swcguild.inheritanceexamples.Employee;
import com.swcguild.inheritanceexamples.Manager;
import com.swcguild.inheritanceexamples.SummerIntern;
import java.util.ArrayList;

/**
 *
 * @author ilyagotfryd
 */
public class App {
    public static void main(String[] args) {
        
        //Employee employee = new Employee();
        Manager manager = new Manager();
        SummerIntern intern = new SummerIntern();
        
        
        manager.setName("Jefferson");
        //employee.doWork();
        manager.doWork();
        intern.doWork();
        manager.createObjective();
        
        Employee undercoverBoss = new Manager("Elysha Spector");
        
        undercoverBoss.doWork();
        ((Manager)undercoverBoss).hire();
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Ilya"));
        employees.add(new SummerIntern());
        //employees.add(new Employee("John Smith"));
        //employees.add(new Employee("Will"));
        
        System.out.println("=========================");
        for(Employee e:employees)
        {
            e.doWork();
            System.out.println("---------------------");
        }
        
        
    }
    
}
