/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox;

import com.swcguild.redbox.dao.MovieDao;
import com.swcguild.redbox.dao.OrderDao;
import com.swcguild.redbox.dao.UserDao;
import com.swcguild.redbox.dto.Dvd;
import com.swcguild.redbox.dto.User;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
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
public class RedBoxController {

    MovieDao movieDao;
    UserDao userDao;
    OrderDao orderDao;

    @Inject
    public RedBoxController(MovieDao movieDao, UserDao userDao, OrderDao orderDao) {
        this.movieDao = movieDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    @RequestMapping(value = {"/", "login"}, method = RequestMethod.GET)
    public String loginMenu() {

        return "home";
    }

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    @ResponseBody
    public List<Dvd> getAllMovies() {
        return null;
    }

    
    }
//    @RequestMapping(value="login/{password}/{email}",method=RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    @ResponseBody public String login(@PathVariable("password")String password, @PathVariable("email")String email){
//        User user = userDao.getUserByEmail(email);
//        if(user.getPassword().equals(password)){
//            return "home/"+user.getId();
//        }else{
//            return "login";
//        }
//        
//    }


