/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooring2.DAO;

import com.swcguild.flooring2.DTO.Order;
import com.swcguild.flooring2.DTO.Product;
import com.swcguild.flooring2.DTO.Tax;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class OrderDAO {

    private HashMap<String, HashMap<String, Order>> orderMap = new HashMap<>();

    public void load(String selectedDate) throws IOException {

        HashMap<String, Order> daysOrders = new HashMap<>();
        String nextLine = "";
        String[] array = new String[12];
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader("Orders_" + selectedDate + ".txt")));
            try {
                sc.nextLine();
            } catch (Exception e) {

            }
            while (sc.hasNext()) {
                Order order = new Order();
                Product product = new Product();
                Tax tax = new Tax();

                nextLine = sc.nextLine();
                array = nextLine.split(",");
                order.setNumber(array[0]);
                order.setName(array[1]);
                tax.setState(array[2]);
                tax.setRate(Double.parseDouble(array[3]));
                product.setName(array[4]);
                order.setArea(Double.parseDouble(array[5]));
                product.setCost(Double.parseDouble(array[6]));
                product.setLabor(Double.parseDouble(array[7]));
                order.setMaterialCost(Double.parseDouble(array[8]));
                order.setLaborCost(Double.parseDouble(array[9]));
                order.setTotalTax(Double.parseDouble(array[10]));
                order.setTotal(Double.parseDouble(array[11]));
                order.setTax(tax);
                order.setProduct(product);

                daysOrders.put(array[0], order);
            }
            orderMap.put(selectedDate, daysOrders);
        } catch (FileNotFoundException ex) {
            orderMap.put(selectedDate, daysOrders);
        }

    }

    public void save(String selectedDate) throws IOException {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("Orders_" + selectedDate + ".txt"));
            out.println("OrderNumber,CustomerName,State,TaxRate,ProductType,"
                    + "Area,CostPerSquareFoot,LaborCostPerSquareFoot,"
                    + "MaterialCost,LaborCost.Tax,Total");
            

            for (Order order : orderMap.get(selectedDate).values()) {
                out.println(order.getNumber() + "," + order.getName()
                        + "," + order.getTax().getState() + "," + order.getTax().getRate()
                        + "," + order.getProduct().getName() + "," + order.getArea()
                        + "," + order.getProduct().getCost() + ","
                        + order.getProduct().getLabor() + ","
                        + order.getMaterialCost() + "," + order.getLaborCost() + ","
                        + order.getTotalTax() + "," + order.getTotal());
                out.flush();
            }
            out.close();
        } catch (Exception e) {
               System.out.println("error!!!!!!!!!!!!");
        }
    }
    public void add(Order order, String selectedDate) throws IOException {
        if (!selectedDate.equals(order.getDate())) {
            save(selectedDate);
            save(order.getDate());
            load(order.getDate());
        }

        HashMap<String, Order> daysOrders = new HashMap<>();
        daysOrders = orderMap.get(order.getDate());

        daysOrders.put(order.getNumber(), order);
        orderMap.put(order.getDate(), daysOrders);
    }

    public HashMap<String, HashMap<String, Order>> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(HashMap<String, HashMap<String, Order>> orderMap) {
        this.orderMap = orderMap;
    }

}
