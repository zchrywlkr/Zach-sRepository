/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooring2.DAO;

import com.swcguild.flooring2.DTO.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ProductDAO {
        HashMap<String,Product> productMap = new HashMap<>();
    public void load() throws FileNotFoundException{
        String nextLine = "";
        String[] array = new String[2];
        Scanner sc = new Scanner(new BufferedReader(new FileReader("Products.txt")));
        sc.nextLine();
        while(sc.hasNext()){
            Product product = new Product();
            nextLine = sc.nextLine();
            array = nextLine.split(",");
            product.setName(array[0]);
            product.setCost(Double.parseDouble(array[1]));
            product.setLabor(Double.parseDouble(array[2]));
            productMap.put(array[0], product);
        }
    }
    public ArrayList<Product> getProductList(){
        ArrayList<Product> productList = new ArrayList<>(productMap.values());
        return productList;
    }
    
}
