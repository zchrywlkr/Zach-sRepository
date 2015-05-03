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
public class AnswerCall {
//    Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer. 
//
//AnswerCell(false, false, false) → true
//AnswerCell(false, false, true) → false
//AnswerCell(true, false, false) → false

public static boolean AnswerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    return((isMorning&&isMom&&!isAsleep)||(!isMorning&&!isAsleep));
    
    }
}
