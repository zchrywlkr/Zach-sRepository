/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.Order;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface OrderDao {
    
    public List<Order> listAllOrders();
    public List<Order> getOrdersByUser(int id);
    public void addOrder(Order order);
    public void removeOrder(int id);
    public Order setTotal(int id,String end);
    public Order makeOrder(int moiveId, int userId);
    public Order getOrder(int id);
    public void updateOrder(Order order);
}
