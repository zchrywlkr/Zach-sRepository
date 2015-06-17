/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.User;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface UserDao {
  public User getUserById(int id);
  public void addUser(User user);
  public void remove(int id);
  public List<Integer> getHistory(int userId);
  public List<User> listAllUsers();
  public User getByCreditCard(String card);
  
  
  
  
  
}
