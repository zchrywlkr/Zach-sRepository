/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.Dao;

import com.swcguild.addressbook2.Dto.Address;
import java.util.List;
import java.util.Map;

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
    public void save();
    public void load();
}
