/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooring2.Controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.flooring2.DAO.OrderDAO;
import com.swcguild.flooring2.DAO.ProductDAO;
import com.swcguild.flooring2.DAO.TaxDAO;
import com.swcguild.flooring2.DTO.Order;
import com.swcguild.flooring2.DTO.Product;
import com.swcguild.flooring2.DTO.Tax;
import com.swcguild.flooring2.Factory.OrderFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author apprentice
 */
public class FloorController {
    ConsoleIO io = new ConsoleIO();
    OrderDAO orders = new OrderDAO();
    Date today = Calendar.getInstance().getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
    String selectedDate = sdf.format(today);
    TaxDAO taxes = new TaxDAO();
    ProductDAO products = new ProductDAO();
    OrderFactory factory = new OrderFactory();
    
    public void run() throws FileNotFoundException, IOException{
        taxes.load();
        products.load();
        orders.load(selectedDate);
        factory.load();
        
        int input = 0;
        boolean exit = false;
        do {
            input = io.scanInt(0, 7, printmenu());
            
            switch(input){
                case 1: selectedDate =changeDate();
                case 2: display();break;
                case 3: Order order = new Order();  addOrder(false,order); break;
                case 4:  editOrder();
                case 5: removeOrder(); break;
                case 6: saveOrders(); break;
                case 7: exit = true; break;
                default : io.printString("input not recognized");
            }
        } while (!exit);
        
    }
    private String changeDate() {
        String input ="";
        boolean exit;
        Date date = new Date();
        String dateChange ="";
        do {
            try{
                exit = true;
                input = io.scanString("select new date in format MMddyyyy or hit enter to keep: "+selectedDate);
                if(input.equals("")){
                    dateChange = selectedDate;
                }else{
                    date = sdf.parse(input);
                    dateChange = sdf.format(date);
                }
                
            }catch(Exception e){
                io.printString("invalid date");
                exit = false;
            }
        } while (!exit);
        return dateChange;
    }
    private void display() {
        for(Order order: orders.getOrderMap().get(selectedDate).values()){
            io.printString(order.getNumber()+ "   " + order.getName() +"  "+ order.getDate() );
        }
        
    }
    private String printmenu() {
        return("Selected date: "+selectedDate+"\r1)Change date \r2) display orders for\r3) Add order \r4)edit order\r5)remove order \r6)Save\r7)Exit");   
    }
    private void removeOrder() {
    }

    private void addOrder(Boolean keep, Order order) throws IOException {
        String name ="";
        Tax tax = new Tax();
        Product product = new Product();
        name = io.scanStringEdit("Enter name on order",order.getName() ,keep);
        
        
        ArrayList<String> states  = taxes.getStates();
        
        for(int i =0; i<states.size(); i++){
            io.printString((i+1) +") "+states.get(i));
        }
        String message;
        if(keep){
            message = ("enter number of state or hit enter to keep: \r"+order.getTax().getState());
        }else{
            message = "enter number of state";
        }
        String stateIndex = io.scanIntAsString(1, states.size(), message,keep);
        if(!stateIndex.equals("")){
            String state = states.get(Integer.parseInt(stateIndex)-1);
             tax = taxes.getTax(state);
        }else{
            tax = order.getTax();
        }
        
        
          if(keep){
            message = ("enter product number or hit enter to keep: \r"+order.getProduct().getName());
        }else{
            message = "enter product number";
        }
        
        ArrayList<Product> productsList = products.getProductList();
        
        for(int i  = 0; i<productsList.size(); i++){
            Product pdct = new Product();
            pdct = productsList.get(i);
            io.printString((i+1)+ ") "+ pdct.getName() +" : cost/ftSqr "+pdct.getCost()+" cost/laborFtSqr "+pdct.getLabor());
        }
        
        String productIndex = io.scanIntAsString(1, productsList.size(), message,keep);
        
        if(productIndex.equals("")){
            product = order.getProduct();
        }else{
            product = productsList.get(Integer.parseInt(productIndex)-1);
        }
        
        
         if(keep){
            message = ("enter area number or hit enter to keep: \r"+order.getArea());
        }else{
            message = "enter area";
        }
        
        String area = io.scanDoubleAsString(0, 1000000, message,keep);
        if(area.equals("")){
            area = String.valueOf(order.getArea());
        }

        String date = changeDate();
        
        order = factory.BuildOrder(name,Double.parseDouble(area),tax,product, order,date);
        
        orders.add(order,selectedDate);
        selectedDate = date;
    }

    private void saveOrders() {
    }

    private void editOrder() throws IOException {
        Boolean exit = true;
        String input = "";
        do {
            exit = false;
            display();
            input = io.scanString("enter order number to edit");
            for(String key :orders.getOrderMap().get(selectedDate).keySet()){
                if(key.equals(input)){
                    exit = true;
                }
            }
        } while (orders.getOrderMap().get(selectedDate).values().size()>0&& !exit);
        Order order = orders.getOrderMap().get(selectedDate).get(input);
        addOrder(true, order);
    }
}
