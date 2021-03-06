/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addresses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AddressBook {

    ArrayList<Address> addresses = new ArrayList<>();
    public final String DELIMITER = "::";

    public boolean addAddress(Address address) {
        return addresses.add(address);
    }

    public void removeAddress(Address address) {
        
            this.addresses.remove(address);
        
    }
    
    public void editAddressFirstName(Address address, String firstName) {
        address.setFirstName(firstName);
    }
    
    public void editAddressLastName(Address address, String lastName) {
        address.setLastName(lastName);
    }
    
    public void editAddressStreet(Address address, String street) {
        address.setStreet(street);
    }
    
    public void editAddressCity(Address address, String city) {
        address.setCity(city);
    }
    
    public void editAddressState(Address address, String state) {
        address.setStat(state);
    }
    
    public void editAddressZip(Address address, String zip) {
        address.setZipcode(Integer.parseInt(zip));
    }

    public ArrayList<Address> findAddress(String lastName) {
        ArrayList<Address> find = new ArrayList<>();
        for (Address address : addresses) {
            if (address.getLastName().equals(lastName)) {
                find.add(address);
            }
        }
        return find;
    }

    public int countAddresses() {
        return addresses.size();
    }

    public void save() throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("Addresses.txt"));
        for (Address address : addresses) {
            out.println(address.getFirstName() + DELIMITER + address.getLastName() + DELIMITER + address.getStreet() + DELIMITER + address.getCity() + DELIMITER + address.getStat() + DELIMITER + address.getZipcode());
            out.flush();
        }
        out.close();
    }

    public void read() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("Addresses.txt")));
        String[] array;
        while(sc.hasNext()){
            String line = sc.nextLine();
            array = line.split(DELIMITER);
            addresses.add(new Address(array[0], array[1], array[2], array[3], array[4], Integer.parseInt(array[5])));
    }
        sc.close();
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

}
