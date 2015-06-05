/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import com.swcguild.addressbook.dao.AddressDao;
import com.swcguild.addressbook.dao.AddressDaoFileImpl;
import com.swcguild.addressbook.dto.Address;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author apprentice
 */
@Controller
public class AddressAjaxController {
    AddressDao dao;
    int id = 0;

    @Inject
    public AddressAjaxController(AddressDaoFileImpl dao) {
        this.dao = dao;
    }
    @RequestMapping(value = {"/ajax"},method = RequestMethod.GET)
    public String displayAjax(){
        return "addressAjax";
    }
    
    @RequestMapping(value = {"/address/{id}"},method = RequestMethod.GET)
    @ResponseBody public Address getAddress(@PathVariable("id")int id){
        return dao.getAddress(id);
    }
    @RequestMapping(value = {"/address"},method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody public Address createAddress(@RequestBody Address address){
        
        address.setId(id++);
        dao.addAddress(address);
        return address;
    }
    @RequestMapping(value = {"/address/{id}"},method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAddress(@PathVariable("id")int id){
        dao.removeAddress(dao.getAddress(id));   
    }
    @RequestMapping(value = "address/{id}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody public void putAddress(@PathVariable("id")int id, @RequestBody Address address){
        address.setId(id);
        dao.addAddress(address);
    }
    
    @RequestMapping(value = {"/addresses"},method = RequestMethod.GET)
    @ResponseBody public List<Address> getAllAddress(){
        return dao.getAllAddresses();
    }
}
