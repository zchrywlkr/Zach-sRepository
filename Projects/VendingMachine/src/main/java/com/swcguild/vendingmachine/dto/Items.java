/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine.dto;

/**
 *
 * @author apprentice
 */
public class Items {
    private int id = 0;
    private String name ="";
    private double cost = 0;
    private int number = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Items(int id, String name, double cost, int number) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.number = number;
    }

    
    
}
