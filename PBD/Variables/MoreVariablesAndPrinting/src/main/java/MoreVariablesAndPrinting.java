/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class MoreVariablesAndPrinting {
    public static void main( String[] args){
        String name, eyes, teeth, hair;
        int age, height,weight;
        
        name ="zach";
        age = 25;
        height = 75;
        weight = 170;
        eyes = "blue";
        teeth = "white";
        hair = "Brown";
      
        System.out.println("Lets talk about " + name+".");
        System.out.println("He's " + height + "inches tall.");
        System.out.println("hes " + weight + "punds heavy");
        System.out.println("Actualy thas not too heavy");
        System.out.println("He got " + eyes + " eyes and " + hair + " hair");
        System.out.println("His teeht are usually " + teeth + " depending on the coffee");
        System.out.println("if i add " + age + ", " + height + ", and " + weight + "i get " + (age + height+ weight) + ".");
        
    }    
}
