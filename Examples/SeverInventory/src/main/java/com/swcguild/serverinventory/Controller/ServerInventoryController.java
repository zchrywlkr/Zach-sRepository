/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.Controller;
import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.serverinventory.DAO.ServerDao;
import com.swcguild.serverinventory.DAO.ServerDaoInMemImpl;
/**
 *
 * @author apprentice
 */
public class ServerInventoryController {
    ServerDao serverDao = new ServerDaoInMemImpl();
    ConsoleIO io = new ConsoleIO();
    public void run(){
        
        String input ="";
        
        do {
            try{
                input = io.scanString(printMenu());
                switch(input){
                    case "1": addServer();break;
                    case "2": removeServer(); break;
                    case "3" : getManufacturer(); break;
                    case "4" : getServerOlderThan(); break;
                    case "5": getSeversOlderThanByManufacturer(); break;
                    case "6": getAverageServerAge(); break;
                    case "7": break;
                    default : io.printString("bad input"); break;
                }   
            }catch(Exception  e){
                io.printString(e.toString());
            }
        
        } while (!input.equals("7"));
    }
    
    private String printMenu() {
        return "+++++++++++++++++++++++++++++++++++++++\r"
                + "\tServers\r1)Add Server\r2)removeServer"
                + "\r3)Get manufacturer\r4)Get server older than"
                + "\r5)Get server older than by manufacturer"
                + "\r6)Average server age\r7) exit "
                + "\r++++++++++++++++++++++++++++++++++"
                + "\rPlease select one of the above options";
    }

    private void addServer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

         
    }

    private void removeServer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getManufacturer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getServerOlderThan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getSeversOlderThanByManufacturer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getAverageServerAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

