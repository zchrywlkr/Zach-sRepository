/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.Controller;

import com.swcguild.baseballleague.dao.League;
import com.swcguild.baseballleague.dao.Team;
import com.swcguild.baseballleague.dto.Player;
import com.swcguild.consoleio.ConsoleIO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class LeagueController {

    ConsoleIO io = new ConsoleIO();
    String input = "";
    League saveLoad = new League();
    HashMap<String, League> leagues = new HashMap<>();

    public void run() throws FileNotFoundException, IOException {
        boolean keepGoin = true;
        leagues = saveLoad.load(leagues);
        do {
            io.printString("Leagues");
            for (League league : leagues.values()) {
                io.printString(league.getId() + "  " + league.getName());
            }
            try {
                input = io.scanString("enter league hit x to exit");
                if (input.equals("x")) {
                    keepGoin = false;
                } else {
                    leaguemenu(leagues.get(input));
                }

            } catch (Exception e) {
                io.printString("input error stop messing around and just enter what is asked!!");
            }

        } while (keepGoin);
        saveLoad.save(leagues);
    }
    private void leaguemenu(League league) {
        boolean keepGoin = true;
        do {
            io.printString("1) Create Team \r2) Choose Team\r3) exit ");
            input = io.scanString("");
            switch (input) {
                case "1":
                    createTeam(league);
                    break;
                case "2":
                    chooseTeam(league);
                    break;
                case "3":
                    keepGoin = false;
                    break;
                default:
                    io.printString("unkown command");
                    break;
            }
        } while (keepGoin);
    }
    private void createTeam(League league) {
        input = io.scanString("enter new team name");
        league.addNewTeam(input);
    }
    private void chooseTeam(League league) {
        for (Team team : league.getTeams().values()) {
            io.printString(team.getId() + " " + team.getName());
        }
        input = io.scanString("select Team or x to exit");

        switch (input) {
            case "x":
                break;
            default:
                teamMenu(league.getTeams().get((input)), league);
                break;
        }
    }
    private void teamMenu(Team team, League league) {
        boolean keepGoin = true;
        do {
            io.printString(team.getName() + " " + team.getId() + "\r\t1) list players\r\t2) creatPlayer\r\t3)remove player\r\t4)Trade Player\r\t5) exit");
            input = io.scanString("");
            switch (input) {
                case "1":
                    listPlayers(team);
                    break;
                case "2":
                    createPlayer(team, league);
                    break;
                case "3":
                    removePlayer(team);
                    break;
                case "4":
                    tradePlayer(team, league);
                    break;
                case "5":
                    keepGoin = false;
                    break;
                default:
                    io.printString("unkown command");
                    break;
            }
        } while (keepGoin);

    }

    private void listPlayers(Team team) {
        for (Player player : team.getPlayers().values()) {
            io.printString(player.getId() + "  " + player.getFirstName() + " " + player.getLastName() + " " + player.getPosition());
        }
    }

    private void createPlayer(Team team, League league) {
        String firstName = io.scanString("enter player first name");
        String lastName = io.scanString("enter last name");
        String number = io.scanString("enter player number");
        String position = io.scanString("enter position");
        league.addNewPlayer(team, firstName, lastName, number, position);
    }

    private void removePlayer(Team team) {
        listPlayers(team);
        input = io.scanString("enter player to delete");
        team.removePlayer(input);
    }

    private void tradePlayer(Team team, League league) {
        Player player;
        Player player2;
        Team team2;
        listPlayers(team);
        input = io.scanString("enter player to trade");
        player = team.getPlayers().get(input);

        for (Team theTeam : league.getTeams().values()) {
            io.printString(theTeam.getId() + " " + theTeam.getName());
        }
        input = io.scanString("enter team to trade with");
        team2 = league.getTeams().get(input);
        listPlayers(team2);
        input = io.scanString("enter player to trade");
        player2 = team2.getPlayers().get(input);
        league.trade(team, team2, player, player2);
        io.printString(player.getFirstName() + " " + player.getLastName() + " is now on " + team2.getName());
        io.printString(player2.getFirstName() + " " + player2.getLastName() + " is now on " + team.getName());
        io.scanString("press enter to continue");
    }

}
