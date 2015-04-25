/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.wheeloffortunewithclasses;

import java.io.FileNotFoundException;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
         WheelOfFortune wOF = new WheelOfFortune();
         wOF.play();
         
    }
    
}
