/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.Controller;

import com.swcguild.addressbook2.Dto.Address;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface Search {
     List<Address> searchZip();
     List<Address> searchCity();
     List<Address> searchLastName();
     
    
}
