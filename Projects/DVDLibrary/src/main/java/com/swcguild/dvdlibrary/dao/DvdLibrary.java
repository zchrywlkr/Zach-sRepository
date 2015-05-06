/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary.dao;

import com.swcguild.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DvdLibrary {
    HashMap<String,DVD> movies = new HashMap<>();
    private final String DELIMITER = "::";
    int id = 0;
    public void addDVD(DVD dvd) {
        dvd.setId(String.valueOf(id));
        movies.put(String.valueOf(id), dvd);
        id++;
    }
    public ArrayList<DVD> findDVD(String title) {
        ArrayList<DVD> dvds = new ArrayList<>();
        for(DVD dvd: movies.values()){
            if(dvd.getTitle().equals(title)){
                dvds.add(dvd);
            }
        }
        return dvds;
    }

    public void removeDVD(String id) {
        movies.remove(id);
    }

    public HashMap<String, DVD> getMovies() {
        return movies;
    }

    public void setMovies(HashMap<String, DVD> movies) {
        this.movies = movies;
    }

    public void save() throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter("dvd.txt"));
        for(DVD dvd: movies.values()){
            out.println(dvd.getTitle()+DELIMITER+dvd.getReleaseDate()+DELIMITER+dvd.getMpaaRating()+DELIMITER+dvd.getDirector()+DELIMITER+dvd.getStudio()+DELIMITER+dvd.getUserRating()+DELIMITER+dvd.getId());
        out.flush();
        }
        out.close();
    }
    public void load() throws FileNotFoundException{
        String nextLine ="";
        String array[] = new String[7];
        Scanner sc = new Scanner(new BufferedReader(new FileReader(("dvd.txt"))));
        while(sc.hasNext()){
            nextLine = sc.nextLine();
            array = nextLine.split(DELIMITER);
            movies.put(array[6],new DVD(array[0],array[1],array[2],array[3],array[4],array[5],array[6]));
            id=Integer.parseInt(array[6]);
        }
        
    }
    
}
