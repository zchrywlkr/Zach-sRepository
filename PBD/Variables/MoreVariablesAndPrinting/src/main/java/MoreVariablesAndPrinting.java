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
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight,myWeight;
        
        myName ="zach";
        myAge = 25;
        myHeight = 75;
        myWeight = 170;
        myEyes = "blue";
        myTeeth = "white";
        myHair = "Brown";
      
        System.out.println("Lets talk about " + myName+".");
        System.out.println("He's " + myHeight + "inches tall.");
        System.out.println("hes " + myWeight + "punds heavy");
        System.out.println("Actualy thas not too heavy");
        System.out.println("He got " + myEyes + " eyes and " + myHair + " hair");
        System.out.println("His teeht are usually " + myTeeth + " depending on the coffee");
        System.out.println("if i add " + myAge + ", " + myHeight + ", and " + myWeight + "i get " + (myAge + myHeight+ myWeight) + ".");
        
    }    
}
