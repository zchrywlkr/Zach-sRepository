/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classexample;

/**
 *
 * @author apprentice
 */
public class Dog {
    private String dogName="";
    private int weight = 0;
    private int age = 0;

    public Dog() {
    }
    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public void bark(){
        System.out.println(dogName + " barks");
    }
    public void sit(){
        System.out.println(dogName +" sits");
    }
    
    
}
