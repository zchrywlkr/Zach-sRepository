/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.DAO;

import com.swcguild.serverinventory.DTO.Server;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public class ServerDaoInMemImpl implements ServerDao {
    Map<String, Server> serverMap = new HashMap<>();    

    @Override
    public void addServer(Server server) {
        serverMap.put(server.getName(), server);
    }

    @Override
    public void removeServer(Server server) {
        serverMap.remove(server.getName());
    }

    @Override
    public List<Server> getManufacturer(String manufacturer) {
        List<Server> serverMake = new ArrayList<>();
        serverMap.values()
                .stream()
                .filter(s -> s.getMake().equalsIgnoreCase(manufacturer))
                .forEach(e -> serverMake.add(e));
        return serverMake;
    }

    @Override
    public List<Server> getServersOlderThan(int ageInYears) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, List<Server>> getSeversOlderThanByManufacturer(int ageInYears) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAverageServerAge() {
        double average = serverMap.values()
                .stream()
                .mapToLong(Server::getServerAge)
                .average()
                .getAsDouble();
        return average;
    }

    @Override
    public Server getServer(String name) {
        return serverMap.get(name);
    }

    @Override
    public List<Server> getAllServers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
