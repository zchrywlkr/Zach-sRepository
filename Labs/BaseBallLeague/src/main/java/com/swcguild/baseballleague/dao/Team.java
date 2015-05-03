/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.dao;

import com.swcguild.baseballleague.dto.Player;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class Team {
    private HashMap<String,Player>players = new HashMap<>();
    private String name = "";
    private String id = "";

    public HashMap<String,Player> getTeam() {
        return players;
    }

    public void setTeam(HashMap<String,Player> team) {
        this.players = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String,Player> getPlayers() {
        return players;
    }

    public void setPlayers(HashMap<String,Player> players) {
        this.players = players;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    void addPlayer(Player player) {
        player.setTeam(id);
        players.put(player.getId(), player);
    }

    public void removePlayer(String input) {
        players.remove(input);
    }
    
    
}
