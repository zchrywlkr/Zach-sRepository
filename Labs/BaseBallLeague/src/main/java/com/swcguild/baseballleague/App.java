/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague;

import com.swcguild.baseballleague.Controller.LeagueController;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LeagueController lc = new LeagueController();
        lc.run();
    }
    
}
