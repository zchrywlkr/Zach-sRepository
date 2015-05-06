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
public class App {
    public static void main(String[] args) {
        Dog rover = new Dog();
        Dog spot = new Dog();
        spot.setDogName("spot");
        spot.setAge(4);
        spot.setWeight(15);
        rover.setAge(2);
        rover.setDogName("rover");
        rover.setWeight(50);
        
        System.out.println("Dogs name is " + rover.getDogName());
        System.out.println(rover.getDogName() + " is " + rover.getAge() + " years old " + (rover.getAge() *7) + " in dog years" );
        System.out.println(rover.getDogName() + " weighs " + rover.getWeight());
        
        rover.bark();
        rover.sit();
        spot.bark();
        spot.sit();
        
        rover = spot;
        rover.setDogName("new name");
        System.out.println(spot.getDogName());
        
        int myVal = 15;
        System.out.println("myVal original value = " + myVal);
        changeMe(myVal);
        System.out.println("myVal after call to change me = " + myVal);
        
        Dog myDog = new Dog();
        myDog.setDogName("Lassie");
        myDog.setWeight(15);
        myDog.setAge(4);
        System.out.println("dog name first " + myDog.getDogName());
        changeMyName(myDog);
        System.out.println("last dog name " + myDog.getDogName());
        System.out.println(myDog.getAge());
        
       
    }
    
    public static void changeMe(int input){
        System.out.println("From inside changeMe input original value = "+input);
        input = 99;
        System.out.println("From inside changeMe inpuyt change value = " + input);
    }
    public static void changeMyName(Dog dog){

        dog = new Dog();
        System.out.println("original name = "+ dog.getDogName());
        dog.setDogName("zzzzzz");
        System.out.println("changed name = " + dog.getDogName());
    }
}
