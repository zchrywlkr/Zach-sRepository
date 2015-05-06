/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.inheritanceexample;

/**
 *
 * @author apprentice
 */
public abstract class Employee {
    
    String employee;

    public Employee() {
        this.employee = "Employee";
    }
   public  void  doWork(){
       System.out.println(employee+": I am woprking as hard as i can!!");
   }
   public void createObjective(){
       System.out.println(employee + ": Drink all the bean juice!");
   }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
   
    
}
