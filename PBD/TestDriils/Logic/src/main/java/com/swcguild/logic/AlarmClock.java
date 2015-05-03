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
public class AlarmClock {
//    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
//and a booleanean indicating if we are on vacation, return a string of 
//the form "7:00" indicating when the alarm clock should ring. Weekdays, \
//the alarm should be "7:00" and on the weekend it should be "10:00". 
//Unless we are on vacation -- then on weekdays it should be "10:00" 
//and weekends it should be "off". 
//
//AlarmClock(1, false) → "7:00"
//AlarmClock(5, false) → "7:00"
//AlarmClock(0, false) → "10:00"

    public static String AlarmClock(int day, boolean vacation) {
        
        if(vacation){
            if((day == 0 || day == 6)){
                return "10:00";
            }else{
                return "off";
            }
            
        }else if(day== 0 || day == 6){
            return "10:00";
        }else{
            return "7:00";
        }
    }

}
