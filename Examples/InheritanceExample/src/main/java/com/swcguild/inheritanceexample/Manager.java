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
public class Manager extends Employee{

    public Manager() {
        
        this.employee = "manager";
    }
    
    
    public void doWork(){
        System.out.println("somthing happening");
    }
    public void hire(){
        System.out.println(employee + " hire someone");
    }
    public void fire(Employee employee){
        System.out.println(employee + " was fired");
        employee.setEmployee(employee.getEmployee() + "was fired" );
    }
    

        
   
    
}
