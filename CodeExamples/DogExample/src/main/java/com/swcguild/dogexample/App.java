
package com.swcguild.dogexample;

/**
 *
 * @author warde
 */
public class App {
    
    public static void main(String[] args) {
        Dog rover = new Dog();
        
        rover.setDogName("Rover");
        rover.setAge(5);
        rover.setWeight(35);
        
        rover.bark();
        rover.sit();
        
        System.out.println(rover.getAge());
        
        Dog spot = new Dog();
        
        spot.setDogName("Spot");
        spot.setAge(2);
        spot.setWeight(15);
        
        spot.bark();
        spot.sit();
        
        rover = spot;
        rover.setDogName("NEW NAME");
        System.out.println(spot.getDogName()); 
        
        int myVal = 15;
        System.out.println("From inside main myVal original value = " + myVal);
        changeMe(myVal);
        System.out.println("From inside main myVal after call to changeMe = " + myVal);
        
        Dog myDog = new Dog();
        myDog.setDogName("Lassie");
        myDog.setAge(15);
        myDog.setWeight(30);
        System.out.println("From inside main myDog original name = " + myDog.getDogName());
        changeMyName(myDog);
        System.out.println("From inside main myDog name after call to changeMyName = " + myDog.getDogName());
    }
    
    public static void changeMe(int input) {
        System.out.println("From inside changeMe input original value = " + input);
        input = 99;
        System.out.println("From inside changeMe input changed value = " + input);
    }
    
    public static void changeMyName(Dog dog) {
        dog = new Dog();
        System.out.println("Inside changeMyName original name = " + dog.getDogName());
        dog.setDogName("ZZZZZZZZZZZZ");
        System.out.println("Inside changeMyName changed name = " + dog.getDogName());
    }

}
