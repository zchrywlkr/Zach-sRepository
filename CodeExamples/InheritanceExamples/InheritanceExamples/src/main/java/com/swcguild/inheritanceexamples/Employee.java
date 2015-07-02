/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.inheritanceexamples;

/**
 *
 * @author ilyagotfryd
 */
public abstract class Employee {
    
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void doWork();
//    {
//        System.out.println("Employee: I'm working as hard as I can!");
//    }
    
    public void createObjective()
    {
        System.out.println("Employee: Drink ALL the bean juice!");
    }
    
    public Employee()
    {
        System.out.println("Employee created.");
    }
    
    public Employee(String name)
    {
        this.name = name;
        System.out.println("Overloaded employee constructor:" + this.name);
    }
    
}
