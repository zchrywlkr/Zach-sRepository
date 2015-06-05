/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook.dao;

import java.util.List;
import java.util.Map;
import com.swcguild.addressbook.dto.Address;
/**
 *
 * @author apprentice
 */
public interface AddressDao {
    public void addAddress(Address address);
    public void editAddress(Address address);
    public void removeAddress(Address address);
    public List<Address> searchLastName(String lastName);
    public List<Address> searchCity(String city);
    public Map<String,List<Address>> searchState(String state);
    public List<Address> searchZipCode(String zipCode);
    public List<Address> getAllAddresses();
    public Address getAddress(int id);
    public void save();
    public void load();
}
