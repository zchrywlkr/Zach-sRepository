/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.dao;

import com.swcguild.baseballleague.dto.Player;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class League {
    int playerID = 0;
    int teamID= 0;
    private String id = "";
    private HashMap<String,Team> teams = new HashMap<>();
    private String name = "";
    public final String DELIMITER = "::";
    
    public HashMap<String,Team> getTeams() {
        return teams;
    }

    public void setTeams(HashMap<String,Team> teams) {
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewTeam(String input) {
        teamID++;
        Team team = new Team();
        team.setName(input);
        team.setId(String.valueOf(teamID));
        teams.put(String.valueOf(teamID), team);
        
    }

    public void addNewPlayer(Team team, String firstName, String lastName, String number, String position) {
        playerID++;
        Player player = new Player();
        player.setFirstName(firstName);
        player.setLastName(lastName);
        player.setNumber(number);
        player.setPosition(position);
        player.setId(String.valueOf(playerID));
        team.addPlayer(player);        
    }

    public void trade(Team team, Team team2, Player player, Player player2) {
        team.addPlayer(player2);
        team2.addPlayer(player);
        team.removePlayer(player.getId());
        team2.removePlayer(player2.getId());
    }
    
    public HashMap<String,League> load(HashMap<String,League> leagues) throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader("baseBall.txt")));
        String array[] = new String[8];
        String nextLine ="";
        League league;
        while(sc.hasNext()){
            nextLine=sc.nextLine();
            array = nextLine.split("::");
            switch (array[0]) {
                case "0":
                    League newLeague = new League(array[1],array[2]);
                    leagues.put(array[1], newLeague);
                    break;
                case "1":
                    Team team = new Team();
                    team.setId(array[1]);
                    team.setName(array[2]);
                    leagues.get(array[3]).addTeam(team);
                    
                    break;
                case "2":
                    Player player = new Player();
                    player.setFirstName(array[3]);
                    player.setLastName(array[4]);
                    player.setId(array[1]);
                    player.setPosition(array[5]);
                    player.setNumber(array[2]);
                    leagues.get(array[7]).addPlayer(player,array[6]);
                default:break;
            }
        }
        return leagues;
    }
    
    public void save(HashMap<String,League> leagues) throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter("baseBall.txt"));
        for(League league: leagues.values()){
            out.println("0"+DELIMITER+league.getId()+DELIMITER+league.getName());
            out.flush();
            for(Team team: league.getTeams().values()){
                out.println("1"+DELIMITER+team.getId()+DELIMITER+team.getName()+DELIMITER +league.getId());
                out.flush();
                for(Player player: team.getPlayers().values()){
                    out.println("2"+DELIMITER+player.getId()+DELIMITER+player.getNumber()+DELIMITER+player.getFirstName()+DELIMITER+player.getLastName()+DELIMITER+player.getPosition()+DELIMITER+player.getTeam()+DELIMITER+league.getId());
                    out.flush();
                }
            }
        }    
        out.close();
    }

    public League(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public League() {
    }

    private void addTeam(Team team) {
        teams.put(String.valueOf(team.getId()), team);
        teamID =Integer.parseInt(team.getId());
    }
    private void addPlayer(Player player, String teamId){
       Team team =teams.get(teamId);
        team.addPlayer(player); 
        playerID = Integer.parseInt(player.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
