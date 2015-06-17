/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.Dvd;
import com.swcguild.redbox.dto.Order;
import com.swcguild.redbox.dto.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
//public class UserDaoImpl implements UserDao{
//    Map<String,User> users = new HashMap<>();
//   
//
//    @Override
//    public User getUserByEmail(String email) {
//        
//        return users.get(email);
//    }

//    @Override
//    public void addUser(User user) {
//        users.put(user.getEmail(), user);
//    }
//
//    @Override
//    public void remove(String email) {
//        users.remove(email);
//    }
//
//    @Override
//    public void addToHistory(User user,int orderId) {
//        ArrayList<Integer> history = user.getHistory();
//        history.add(orderId);
//        user.setHistory(history);
//    }
//
//    @Override
//    public void addToWishList(User user, int movieId) {
//        ArrayList wishList = user.getWishList();
//        wishList.add(movieId);
//        user.setWishList(wishList);
//    }
//
//    @Override
//    public void removeFromWishList(User user,int movieId) {
//        ArrayList wishList = user.getWishList();
//        for(int i =0;i<wishList.size();i++){
//            if (wishList.get(i).equals(movieId)){
//                wishList.remove(i);
//            }
//        }
//        
//        user.setWishList(wishList);
//    }
//
//    @Override
//    public List<User> listAll() {
//        ArrayList allUsers = new ArrayList(users.values());
//        return allUsers;
//    }
//
//    @Override
//    public void addTestData() {
//        User u1 = new User();
//        u1.setEmail("zach");
//        u1.setPassword("password");
//        u1.setId(1);
//        users.put(u1.getEmail(), u1);
//    }
//}
