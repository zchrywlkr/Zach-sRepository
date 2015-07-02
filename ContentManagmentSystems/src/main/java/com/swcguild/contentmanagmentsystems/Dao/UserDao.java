/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.User;

/**
 *
 * @author apprentice
 */
public interface UserDao {

    public User addUser(User user);

    public User getUser(int userId);

    public void deleteUser(User user);

    public void editUser(User user);

}
