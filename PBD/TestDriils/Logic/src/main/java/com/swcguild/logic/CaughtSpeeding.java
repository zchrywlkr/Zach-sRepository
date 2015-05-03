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
public class CaughtSpeeding {
//    You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. 
//
//CaughtSpeeding(60, false) → 0
//CaughtSpeeding(65, false) → 1
//CaughtSpeeding(65, true) → 0

    public static int CaughtSpeeding(int speed, boolean isBirthday) {
        if(speed<=60 || (speed<=65 && isBirthday)){
            return 0;
        }else if((speed>= 60 && speed<= 80)|| (speed>=65 && speed<=85&&isBirthday)){
            return 1;
        }else{
            return 2;
        }
    }

}
