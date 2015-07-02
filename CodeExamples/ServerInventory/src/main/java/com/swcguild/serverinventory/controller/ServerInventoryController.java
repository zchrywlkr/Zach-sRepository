package com.swcguild.serverinventory.controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.serverinventory.dao.ServerDao;
import com.swcguild.serverinventory.dao.ServerDaoInMemImpl;

/**
 *
 * @author warde
 */
public class ServerInventoryController {

    ConsoleIO con = new ConsoleIO();
    ServerDao dao = new ServerDaoInMemImpl();

    public void run() {
        int userChoice = 0;

        do {
            printMenu();
            userChoice = con.readInt("Please choose from the above options.");

            switch (userChoice) {
                case 1:
                    addServer();
                    break;
                case 2:
                    removeServer();
                    break;
                case 3:
                    listServersByManufacturer();
                    break;
                case 4:
                    listServersOlderThan();
                    break;
                case 5:
                    listServersOlderThanGroupByMake();
                    break;
                case 6:
                    getAverageServerAge();
                    break;
                case 7:
                    break;
                default:
                    con.print("Invalid Choice");
            }
        } while (userChoice != 7);

    }

    private void printMenu() {
        con.print("+++++++++++++++++++++++++++++++++++++++++++++++++");
        con.print("1. Add Server");
        con.print("2. Remove Server");
        con.print("3. List Servers By Manufacturer");
        con.print("4. List Servers Older Than");
        con.print("5. List Servers Older Than Group By Make");
        con.print("6. Get Average Server Age");
        con.print("7. Exit");
        con.print("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    private void addServer() {
        con.print("ADD SERVER...");
    }

    private void removeServer() {
        con.print("REMOVE SERVER");
    }

    private void listServersByManufacturer() {
        con.print("LIST SERVER BY MANUFACTURER");
    }

    private void listServersOlderThan() {
        con.print("LIST SERVERS OLDER THAN");
    }

    private void listServersOlderThanGroupByMake() {
        con.print("LIST SERVERS OLDER THAN GROUP BY MAKE");

    }

    private void getAverageServerAge() {
        con.print("GET AVERAGE SERVER AGE");
    }

}
