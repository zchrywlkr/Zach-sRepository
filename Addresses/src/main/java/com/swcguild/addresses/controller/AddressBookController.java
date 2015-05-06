/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addresses.controller;

import com.swcguild.addresses.AddressException;
import com.swcguild.addresses.dao.AddressBook;
import com.swcguild.addresses.dto.Address;
import com.swcguild.consoleio.ConsoleIO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class AddressBookController {
    private ConsoleIO io = new ConsoleIO();
    private AddressBook addressBook = new AddressBook();
    public void run() throws AddressException {
        try {
            addressBook.read();

            int userInput = 0;
            boolean keepgoing = true;
            do {
                printMenu();
                userInput = io.scanInt("");
                switch (userInput) {
                    case 1:
                        addAddress();
                        break;
                    case 2:
                        deleteAddress();
                        break;
                    case 3:
                        findAddress();
                        break;
                    case 4:
                        countAddress();
                        break;
                    case 5:
                        showAddresses();
                        break;
                    case 6:
                        editAddress();
                        break;
                    case 7:
                        keepgoing = false;
                        break;
                    default:
                        io.printString("unknown input");
                }
            } while (keepgoing);
            addressBook.save();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddressBookController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddressBookController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    private void printMenu() {
        io.printString("Initial Menu: ");
        io.printString("\tPlease select the operation you wish to perform: ");
        io.printString("\t\t1. Add Adddress");
        io.printString("\t\t2. Delete Address");
        io.printString("\t\t3. Find address");
        io.printString("\t\t4. List Address count");
        io.printString("\t\t5. List all addresses");
        io.printString("\t\t6. Edit address");
        io.printString("\t\t7 exit");
    }
    private void addAddress() {
        boolean addressExists = false;
        String addMoreAddress = "";
        do {
            io.printString("Add Address menu");
            String firstName = io.scanString("please  enter first name");
            String lastName = io.scanString("please enter last name");
            String streetAddress = io.scanString("please enter street address");
            String city = io.scanString("please enter city");
            String state = io.scanString("please enter state");
            String zipcode = io.scanString("please enter zip");

            Address newAddress = new Address(firstName, lastName, streetAddress, city, state, zipcode);
            ArrayList<Address> checkAddresses = new ArrayList<>();
            checkAddresses = addressBook.findAddress(lastName);
            for (Address address : checkAddresses) {
                if (address.equals(newAddress)) {
                    addressExists = true;
                    io.printString("Address exists");
                    break;
                }
            }
            if (!addressExists) {
                addressBook.addAddress(newAddress);
                io.printString("Address Added.");
            }

            addMoreAddress = io.scanString("Press 'y' to enter another address or 1 to go to Main Menu");

        } while (addMoreAddress.equalsIgnoreCase("y"));
    }

    private void deleteAddress() {
        String deleteMoreAddress = "";
        int count = 1;

        do {
            io.printString("Delete Address Menu: \rEnter \"0\" to exit");
            String lastName = io.scanString("\tPlease Enter Last Name of Address to Delete");
            ArrayList<Address> addressFound = addressBook.findAddress(lastName);
            for (Address eachAddress : addressFound) {
                String stringcount = Integer.toString(count);
                io.printString("enter to delete: " + stringcount);
                io.printString(eachAddress.getFirstName() + " " + eachAddress.getLastName());
                io.printString(eachAddress.getStreet());
                io.printString(eachAddress.getCity() + ", " + eachAddress.getState() + ", " + eachAddress.getZipcode());
                count++;
            }

            int deleteAddress = io.scanInt("Chose which address delete ");
            if (deleteAddress != 0) {
                addressBook.removeAddress(addressFound.get(deleteAddress-1));
                io.printString("Address Deleted");
            } else {
                io.printString("Address not deleted.");
            }
            deleteMoreAddress = io.scanString("Press 'y' to delete another address or 1 to go to Main Menu");
        } while (deleteMoreAddress.equalsIgnoreCase("y"));
    }

    private void findAddress() {
        io.printString("find Address Menu:");
        String lastName = io.scanString("\tPlease Enter Last Name of Address to find");
        ArrayList<Address> addressFound = addressBook.findAddress(lastName);
        for (Address eachAddress : addressFound) {
            io.printString(eachAddress.getFirstName() + " " + eachAddress.getLastName());
            io.printString(eachAddress.getStreet());
            io.printString(eachAddress.getCity() + ", " + eachAddress.getState() + ", " + eachAddress.getZipcode());
        }
    }

    private void countAddress() {
        io.printString("List Addres Count Menu: \r\t There are " + addressBook.countAddresses() + " addresses in the book. Press 1 to go to Main Menu");
        io.scanString("");
    }

    private void showAddresses() {
        for (Address address : addressBook.getAddresses().values()) {
            io.printString("");
            io.printString(address.getFirstName() + " " + address.getLastName());
            io.printString(address.getStreet());
            io.printString(address.getCity() + ", " + address.getState() + ", " + address.getZipcode()+"\r");
            
        }
    }
    private void editAddress() {
        io.printString("find Address Menu:");
        String lastName = io.scanString("\tPlease Enter Last Name of Address to find");
        ArrayList<Address> addressFound = addressBook.findAddress(lastName);
        int count = 0;
        for (Address eachAddress : addressFound) {
            String stringcount = Integer.toString(count);
            io.printString("enter to edit: " + stringcount);
            io.printString(eachAddress.getFirstName() + " " + eachAddress.getLastName());
            io.printString(eachAddress.getStreet());
            io.printString(eachAddress.getCity() + ", " + eachAddress.getState() + ", " + eachAddress.getZipcode());
            count++;
        }
        int edit = io.scanInt("Chose which address edit ");
        Address editAddress = addressFound.get(edit);

        io.printString("1:" + editAddress.getFirstName() + " " + "2:" + editAddress.getLastName());
        io.printString("3:" + editAddress.getStreet());
        io.printString("4" + editAddress.getCity() + ", " + "5" + editAddress.getState() + ", " + "6" + editAddress.getZipcode());

        int userChoice = io.scanInt("Which field do you wish to edit? (1-6): ");

        switch (userChoice) {
            case 1:
                String newFirstName = io.scanString("Enter new First Name: ");
                editAddress.setFirstName(newFirstName);
                break;
            case 2:
                String newLastName = io.scanString("Enter new Last Name: ");
                editAddress.setLastName(newLastName);
                break;
            case 3:
                String newStreet = io.scanString("Enter new Street: ");
                editAddress.setStreet(newStreet);
                
                break;
            case 4:
                String newCity = io.scanString("Enter new City: ");
                editAddress.setCity(newCity);
                break;
            case 5:
                String newState = io.scanString("Enter new State: ");
                editAddress.setState(newState);
                break;
            case 6:
                String newZip = io.scanString("Enter new Zip: ");
                editAddress.setZipcode(newZip);
                break;
            default:
                throw new AssertionError();
        }
        addressBook.editAddress(editAddress);
    }
    
}
