/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.Dao;

import com.swcguild.addressbook2.Dto.Address;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class AddressDaoFileImpl implements AddressDao{
    Map<String,Address> addressMap = new HashMap<>();
    String DELIMITER ="::";

    @Override
    public void addAddress(Address address) {
        addressMap.put(address.getId(), address);
    }

    @Override
    public void editAddress(Address address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAddress(Address address) {
        addressMap.remove(address.getId());
    }

    @Override
    public List<Address> searchLastName(String lastName) {
        return addressMap.values()
                .stream()
                .filter(s -> s.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
        
    }

    @Override
    public List<Address> searchCity(String city) {
        return addressMap.values()
                .stream()
                .filter(s -> s.getCity().equals(city))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String,List<Address>> searchState(String state) {
        return addressMap.values()
                .stream()
                .filter(s -> s.getState().equals(state))
                .collect(Collectors.groupingBy(Address::getCity));
                
    }

    @Override
    public List<Address> searchZipCode(String zipCode) {
        return addressMap.values()
                .stream()
                .filter(s -> s.getZipCode().equals(zipCode))
                .collect(Collectors.toList());

    }

    @Override
    public List<Address> getAllAddresses() {
        List<Address> allAddress = new ArrayList<>(addressMap.values());
        return allAddress;
    }

    @Override
    public void save(){
        try (PrintWriter out = new PrintWriter(new FileWriter("address.txt"))) {
            addressMap.values()
                    .stream()
                    .forEach(s -> {
                        out.println(s.getFirstName()+DELIMITER+s.getLastName()+DELIMITER + s.getStreet()+DELIMITER+
                                s.getCity()+DELIMITER+s.getState()+DELIMITER+s.getZipCode()+DELIMITER+s.getId());
                        out.flush();
                    });
            
        } catch (IOException ex) {
            Logger.getLogger(AddressDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void load() {
        String[] array  = new String[7];
        String nextLine ="";
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("address.txt")))) {
            while(sc.hasNext()){
                Address a = new  Address();
                nextLine = sc.nextLine();
                array = nextLine.split(DELIMITER);
                a.setFirstName(array[0]);
                a.setLastName(array[1]);
                a.setStreet(array[2]);
                a.setCity(array[3]);
                a.setState(array[4]);
                a.setZipCode(array[5]);
                a.setId(array[6]);
            }
        } catch (FileNotFoundException ex) {
        }
    }


    
}
