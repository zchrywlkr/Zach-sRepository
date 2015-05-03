//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
//
//sleepIn(false, false) -> true
//sleepIn(true, false) -> false
//sleepIn(false, true) -> true


package com.swcguild.conditionals;

/**
 *
 * @author apprentice
 */
public class Sleeping {
    public static boolean CanSleepIn(boolean isWeekday, boolean isVacation) {
        if(!isWeekday || isVacation ){
            return true;
        }else{
            return false;
        }
  
    }
    
}
