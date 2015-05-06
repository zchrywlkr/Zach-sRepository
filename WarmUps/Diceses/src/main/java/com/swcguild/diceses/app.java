/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.diceses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class app {
    public static void main(String[] args) {
        Random r = new Random();
        int dice1=0;
        int dice2=0;
        ArrayList<Integer> nums = new ArrayList<>();
        int num =0;
        for(int i =0; i< 50; i++){
            dice1=1+ r.nextInt(6);
            dice2=1+r.nextInt(6);
            nums.add(dice1+dice2);
        }
        
        Collections.sort(nums);
        for(int i = 0; i< nums.size(); i++){
            if((i == 0) || (nums.get(i) != nums.get(i-1))){
                System.out.print(nums.get(i) + " :  ");
            }
            System.out.print("*");
            if(i==49){
                break;
            }
            if(nums.get(i)!= nums.get(i+1)){
                System.out.println();
            }
        }
        
        
    }
    
}
