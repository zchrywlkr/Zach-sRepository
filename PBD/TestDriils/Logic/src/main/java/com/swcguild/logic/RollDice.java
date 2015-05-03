/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logic;

/**
 *
 * @author apprentice
 */
public class RollDice {
//    Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6. 
//
//RollDice(2, 3, true) → 5
//RollDice(3, 3, true) → 7
//RollDice(3, 3, false) → 6

public static int RollDice(int die1, int die2, boolean noDoubles) {
    
    if(die1!=die2 || !noDoubles){
        return die1+die2;
    }else{
        die1 = (die1%6)+1;
        return die1+die2;
    }

}
}
