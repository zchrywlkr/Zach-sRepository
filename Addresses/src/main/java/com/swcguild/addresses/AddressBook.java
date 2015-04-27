/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addresses;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class AddressBook {
    ArrayList<Address> addresses = new ArrayList<>();
    
    public boolean addAddress(Address address){
        return addresses.add(address);
    }
    
    public void removeAddress(ArrayList<Address> addresses){
        for (Address address : addresses) {
            this.addresses.remove(address);
        }
    }
    
    public ArrayList<Address> findAddress(String lastName){
        ArrayList<Address> find = new ArrayList<>();
        for(Address address:addresses){
        if(address.getLastName().equals(lastName)){
            find.add(address);
        }
    }
        return find;
    }
    
    public int countAddresses(){
        return addresses.size();
    }
    
    public void save(){
        
    }
    public void read(){
        
    }
}

