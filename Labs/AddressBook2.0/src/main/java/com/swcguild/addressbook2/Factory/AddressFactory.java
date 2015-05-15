/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.Factory;

import com.swcguild.addressbook2.Dto.Address;

/**
 *
 * @author apprentice
 */
public class AddressFactory {
    int id = 0;
    public Address buildAddress(String first, String last,String street,String city,String state,String zip){
        Address address = new Address();
        address.setFirstName(first);
        address.setLastName(last);
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(zip);
        address.setId(String.valueOf(id));
        id++;
        
        return address;
    }
    
}
