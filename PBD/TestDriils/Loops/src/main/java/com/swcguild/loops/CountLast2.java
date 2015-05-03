/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

/**
 *
 * @author apprentice
 */
public class CountLast2 {
//    Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring). 
//
//CountLast2("hixxhi") -> 1
//CountLast2("xaxxaxaxx") -> 1
//CountLast2("axxxaaxx") -> 2

//    public static int CountLast2(String str) {
//        StringBuilder last2 = new StringBuilder();
//        last2.append(str.substring(str.length() - 2, str.length()));
//        
//        System.out.println(last2);
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        
//        for (int i = 0; i < str.length()-2; i++){
//            sb.delete(0, 2);
//            sb.append(str.substring(i, i+2));
//             
//            if(sb.equals(last2)){
//                
//                count++;
//            }
//        }
//        return count;
//    }

        public static int CountLast2(String str) {
        String last2 = "";
        last2 = (Character.toString(str.charAt(str.length() -2)));
        last2 += (Character.toString(str.charAt(str.length() -1)));
        
        String test = "";
        int count = 0;
        
        for (int i = 0; i < str.length()-2; i++){
            
            test = (Character.toString(str.charAt(i)));
            test += (Character.toString(str.charAt(i+1)));
            
            if(test.equals(last2)){
                
                count++;
            }
        }
        return count;
    }
}
