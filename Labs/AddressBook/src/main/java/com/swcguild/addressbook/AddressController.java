/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import com.swcguild.addressbook.dao.AddressDao;
import com.swcguild.addressbook.dao.AddressDaoFileImpl;
import com.swcguild.addressbook.dto.Address;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class AddressController {
    AddressDao dao;
    int id =0;

    @Inject
    public AddressController(AddressDaoFileImpl dao) {
        this.dao = dao;
    }
    
    @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
    public String goHome(Model model){
        model.addAttribute("addressList", dao.getAllAddresses());
        return "home";
    }
    
    @RequestMapping(value = {"displayAddAddress"},method = RequestMethod.GET)
    public String displayAdd(Model model){
        Address address = new Address();
        model.addAttribute("address", address);
        return "displayAddAddress";
    }
    
    @RequestMapping(value = {"saveAddress"},method = RequestMethod.POST)
    public String saveAddress(@Valid @ModelAttribute("address")Address address,BindingResult result){
      if(result.hasErrors()){
                return "displayAddAddress";
            }
      if(address.getId() == -1){
          address.setId(id);
          id++;
      }
        dao.addAddress(address);
        return "redirect:home";
    }
    
    @RequestMapping(value="deleteAddress",method= RequestMethod.GET)
    public String deleteAddress(HttpServletRequest req){
         int id = Integer.parseInt(req.getParameter("AddressId"));
        Address address = dao.getAddress(id);
        dao.removeAddress(address);
        return "redirect:home";
    }
    
    @RequestMapping(value = {"editAddress"},method = RequestMethod.GET)
    public String editAddress(Model model,HttpServletRequest req){
        Address address = dao.getAddress(Integer.parseInt(req.getParameter("AddressId")));
        model.addAttribute("address", address);
        return "displayAddAddress";
    }
    
    @RequestMapping(value = "/displaySearchResults",method=RequestMethod.POST)
    public String Searchresult(Model model,HttpServletRequest req){
        String searchType = req.getParameter("searchType");
        String str = req.getParameter("SearchTerm");
        List<Address> list = new ArrayList<>();
        switch(searchType){
            case "lastName": list = dao.searchLastName(str); break;
            case "city":list = dao.searchCity(str); break;
            case "zip":list = dao.searchZipCode(str); break;
        }
        
        model.addAttribute("addressList",list);
        return "searchResult";
    }
}
