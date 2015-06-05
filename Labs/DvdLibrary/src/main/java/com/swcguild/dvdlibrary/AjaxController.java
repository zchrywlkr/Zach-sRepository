package com.swcguild.dvdlibrary;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apprentice
 */
@Controller
public class AjaxController {

    DvdLibraryDao dao;

    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    public String displayAjax() {
        return "DvdWithAjax";
    }

    @Inject
    public AjaxController(DvdLibraryDao dao) {
        this.dao = dao;
    }
    
    @RequestMapping(value="/dvd/{id}", method = RequestMethod.GET)
    @ResponseBody public Dvd getDvd(@PathVariable("id")int id){
        return dao.getById(id);
    }
    
    @RequestMapping(value="/dvd", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody public Dvd createDvd(@RequestBody Dvd dvd){
        dao.add(dvd);
        return dvd;
    }
    
    @RequestMapping(value="/dvd/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteColntact(@PathVariable("id")int id){
        dao.remove(id);
    }
    
    @RequestMapping(value="/dvd/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody public void putContact(@PathVariable("id")int id, @RequestBody Dvd dvd){
        dvd.setId(id);
        dao.add(dvd);
    }
    
    @RequestMapping(value="/dvds", method = RequestMethod.GET)
    @ResponseBody public List<Dvd> getAllDvds(){
        return dao.listAll();
    }
}
