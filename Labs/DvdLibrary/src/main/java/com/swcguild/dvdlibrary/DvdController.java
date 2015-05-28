/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
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
public class DvdController {
    DvdLibraryDao dao;
    int id = 0;
    @Inject
    public DvdController(DvdLibraryDao dao) {
        this.dao = dao;
    }
    
     @RequestMapping(value={"/","/home"}, method =RequestMethod.GET)
    public String displayDvd(Model model){
        model.addAttribute("dvdList", dao.listAll());
        return "home";
    }
     @RequestMapping(value="displayAddDvd", method =RequestMethod.GET)
    public String displayAddDvd(Model model){
        Dvd dvd = new Dvd();
        dvd.setId(-1);
        dvd.setReleaseDate(LocalDate.MIN);
        model.addAttribute("dvd", dvd);
        return "addDvdForm";
    }
    
    @RequestMapping(value="saveDvd",method =RequestMethod.POST)
    public String addDvd(@Valid @ModelAttribute("dvd") Dvd dvd, BindingResult result){
        
        
        if(result.hasErrors()){
                return "addDvdForm";
            }
        if(dvd.getId()==-1){
            dvd.setId(id);
            id++;
        }
        dao.add(dvd);
        
        return "redirect:home";
    }
      @RequestMapping(value="editDvd", method =RequestMethod.GET)
        public String editContactNoAjax(HttpServletRequest req,Model model){
            
            int id = Integer.parseInt(req.getParameter("dvdId"));
             Dvd dvd = dao.getById(id);
            model.addAttribute("dvd", dvd);
            
            return "addDvdForm";
        }
      @RequestMapping(value="deleteDvd", method =RequestMethod.GET)
        public String deleteContactNoAjax(HttpServletRequest req,Model model){
            
            int id = Integer.parseInt(req.getParameter("dvdId"));
            
            dao.remove(id);
            
            return "redirect:home";
        }
        
        @RequestMapping(value="displaySearchResults",method  = RequestMethod.POST)
        public String displaySearchResults(HttpServletRequest req, Model model){
            List<Dvd> list = new ArrayList<>();
           String searchType = req.getParameter("searchType");
           String searchTerm = req.getParameter("SearchTerm");
            switch(searchType){
                case"Title": list = dao.getByTitle(searchTerm);break;
                case"rating": list = dao.getByRating(searchTerm);break;
                case"Studio": list = dao.getByStudio(searchTerm);break;
            }
            
            model.addAttribute("list", list);
            
            return "searchResult";
        }
        
}
