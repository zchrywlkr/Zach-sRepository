/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.DAO;

import com.swcguild.serverinventory.DTO.Server;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface ServerDao {
    public void addServer(Server server);
    public Server getServer(String name);
    public List<Server>getAllServers();
    public void removeServer(Server server);
    public List<Server> getManufacturer(String manufacturer);
    public List<Server> getServersOlderThan(int ageInYears);
    public Map<String,List<Server>> getSeversOlderThanByManufacturer(int ageInYears);
    public double getAverageServerAge();
}
