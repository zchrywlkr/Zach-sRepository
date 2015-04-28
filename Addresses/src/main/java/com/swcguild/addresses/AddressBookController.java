/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addresses;

import com.swcguild.consoleio.ConsoleIO;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class AddressBookController {
    
    private ConsoleIO io = new ConsoleIO();
    private  AddressBook addressBook = new AddressBook();
    
    public void run(){
        int userInput= 0;
        boolean keepgoing = true;
        do {
            printMenu();
            userInput = io.scanInt("");
            switch(userInput){
                case 1: addAddress();break;
                case 2: deleteAddress(); break;
                case 3: findAddress(); break;
                case 4: countAddress(); break;
                case 5: showAddresses();break;
                case 6: keepgoing = false; break;
                default: io.printString("unknown input");
            }
        } while (keepgoing);
    }    

    private void printMenu() {
        io.printString("Initial Menu: ");
        io.printString("\tPlease select the operation you wish to perform: ");
        io.printString("\t\t1. Add Adddress");
        io.printString("\t\t2. Delete Address");
        io.printString("\t\t3. Find address");
        io.printString("\t\t4. List Address count");
        io.printString("\t\t5. List all addresses");
        io.printString("\t\t6. exit");
    }
    private void addAddress() {
        boolean addressExists = false;
        String addMoreAddress = "";
        do  {
            io.printString("Add Address menu");
            String firstName = io.scanString("please  enter first name");
            String lastName = io.scanString("please enter last name");
            String streetAddress = io.scanString("please enter street address");
            String city = io.scanString("please enter city");
            String state = io.scanString("please enter state");
            int zipcode = io.scanInt("please enter zip");

            Address newAddress = new Address(firstName,lastName,streetAddress,city,state,zipcode);
            ArrayList<Address> checkAddresses = new ArrayList<>();
            checkAddresses = addressBook.findAddress(lastName);
            for(Address address: checkAddresses){
                if(address.equals(newAddress)){
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
        do {
            io.printString("Delete Address Menu:");
            String lastName = io.scanString("\tPlease Enter Last Name of Address to Delete");
            ArrayList<Address> addressFound = addressBook.findAddress(lastName);
            for (Address eachAddress : addressFound) {
                io.printString(eachAddress.getFirstName() + " " + eachAddress.getLastName());
                io.printString(eachAddress.getStreet());
                io.printString(eachAddress.getCity() + ", " + eachAddress.getStat() + ", " + eachAddress.getZipcode());
            }
            String deleteAddress = io.scanString("Really Delete? (y/n) ");
            if (deleteAddress.equalsIgnoreCase("y")) {
                addressBook.removeAddress(addressBook.findAddress(lastName));
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
                io.printString(eachAddress.getCity() + ", " + eachAddress.getStat() + ", " + eachAddress.getZipcode());
            }
    }
    private void countAddress() {
        io.printString("List Addres Count Menu: \r\t There are " +addressBook.countAddresses() + " addresses in the book. Press 1 to go to Main Menu" );
        io.scanString("");
    }
    private void showAddresses() {
            for(Address address:addressBook.getAddresses()){
                 io.printString(address.getFirstName() + " " + address.getLastName());
                io.printString(address.getStreet());
                io.printString(address.getCity() + ", " + address.getStat() + ", " + address.getZipcode());
            }
    }
}
