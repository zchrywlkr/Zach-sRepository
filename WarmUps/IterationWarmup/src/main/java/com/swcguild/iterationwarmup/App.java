/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.iterationwarmup;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        teams.add("Vikings"); teams.add("Packers");teams.add("Lions");teams.add("Bears");teams.add("Browns");
        teams.add("Bengals"); teams.add("Steelers"); teams.add("Ravens");
        
        for(String team: teams){
            System.out.println(team);
        }
        System.out.println();
        for(int i =0; i< teams.size(); i++){
            System.out.println(teams.get(i));
        }
        System.out.println();
        Iterator<String> itTeams = teams.iterator();
        while(itTeams.hasNext()){
            System.out.println(itTeams.next());
        }
    }
    
}
