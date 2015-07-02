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
public class Manager extends Employee {
    public void doWork()
    {
        //super.doWork();
        System.out.println(name + " Manager: Managing the folks here.");
    }
    
    public void createObjective()
    {
        
        System.out.println("Manager: Manage to the best of my ability!");
        super.createObjective();
    }
    
    public void hire()
    {
        System.out.println("Welcome aboard.");
    }
    
    public void fire()
    {
        System.out.println("Your services are no longer necessary!");
    }
    
    public void givePerfomnaceReviews()
    {
        System.out.println("Well done. Work harder next year, please.");
    }
    
    public Manager()
    {
        super("Steve");
        System.out.println("Manager created here.");
    }
    
    public Manager(String name)
    {
        super(name);
        System.out.println("Manager with name created here." + name);
    }
    
}
