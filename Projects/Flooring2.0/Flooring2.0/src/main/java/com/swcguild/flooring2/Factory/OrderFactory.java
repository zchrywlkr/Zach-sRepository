/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooring2.Factory;

import com.swcguild.flooring2.DTO.Order;
import com.swcguild.flooring2.DTO.Product;
import com.swcguild.flooring2.DTO.Tax;

/**
 *
 * @author apprentice
 */
public class OrderFactory {
    int orderNumber =0;
    public void load() {
        
    }

    public Order BuildOrder(String name, double area, Tax tax, Product product, Order order,String date) {
        
        if(order.getNumber().equals("")){
            orderNumber++;
            order.setNumber(String.valueOf(orderNumber));
        }
        
        order.setArea(area);
        order.setName(name);
        order.setLaborCost(area*product.getLabor());
        order.setMaterialCost(area*product.getCost());
        order.setTotalTax((tax.getRate()/100) * (order.getLaborCost()+order.getMaterialCost()));
        order.setTotal(order.getLaborCost()+order.getTotalTax()+order.getMaterialCost());
        order.setDate(date);
        return order;
    }
    
}
