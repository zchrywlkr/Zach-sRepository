/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstream.Dao;

import com.swcguild.dvdlibrarywithstream.Dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DvdDaoDummyImpl implements DvdDao {
    String DELIMETER = "::";

    Map<String, Dvd> dvdMap = new HashMap<>();
    int id = 0;

    @Override
    public void addDvd(Dvd dvd) {
        if(dvd.getId().equals("-1")){
            id++;
            dvd.setId(String.valueOf(id));
        }
        dvdMap.put(dvd.getId(), dvd);
    }

    @Override
    public void removeDvd(Dvd dvd) {
        dvdMap.remove(dvd.getId());
    }

    @Override
    public List<Dvd> findlastnYears(int n) {
        return dvdMap.values()
                .stream()
                .filter(s -> s.getDvdAge() >= n)
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> findMpaaRating(String mpaa) {
        List<Dvd> mpaaList = new ArrayList<>();
        dvdMap.values()
                .stream()
                .filter(s -> s.getMpaa().equalsIgnoreCase(mpaa))
                .forEach(e -> mpaaList.add(e));
        return mpaaList;
    }

    @Override
    public List<Dvd> findStudio(String studio) {
        List<Dvd> studioList = new ArrayList<>();
        dvdMap.values()
                .stream()
                .filter(s -> s.getStudio().equalsIgnoreCase(studio))
                .forEach(e -> studioList.add(e));
        return studioList;
    }

    @Override
    public double getAverageAge() {
        return dvdMap.values()
                .stream()
                .mapToDouble(Dvd::getDvdAge)
                .average()
                .getAsDouble();
    }
    @Override
    public List<Dvd> getNewestMovie() {
        double min = dvdMap.values()
                .stream()
                .mapToDouble(Dvd::getDvdAge)
                .min()
                .getAsDouble();
        return dvdMap.values()
                .stream()
                .filter(s -> s.getDvdAge() == min)
                .collect(Collectors.toList());
    }
    @Override
    public List<Dvd> getOldest() {
        Dvd oldest = new Dvd();
        oldest.setReleaseDate(LocalDate.now());
        double max = dvdMap.values()
                .stream()
                .mapToDouble(Dvd::getDvdAge)
                .max()
                .getAsDouble();
        return dvdMap.values()
                .stream()
                .filter(s -> s.getDvdAge() == max)
                .collect(Collectors.toList());
    }
    @Override
    public double getAverageNumNotes() {
        return dvdMap.values()
                .stream()
                .mapToDouble(s -> s.getNotes().size())
                .average()
                .getAsDouble();
    }
    @Override
    public List<Dvd> getAllDvds() {
        List<Dvd> list = new ArrayList<>(dvdMap.values());
        return list;
    }
    @Override
    public Dvd getDvd(String id) {
        return dvdMap.get(id);
    }
    @Override
    public Map<String, List<Dvd>> findDirector(String director) {
        return dvdMap.values()
                .stream()
                .filter(s -> s.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.groupingBy(Dvd::getMpaa));
    }
    @Override
    public void save() throws Exception{
        PrintWriter out = new PrintWriter(new FileWriter("dvd.txt"));

        dvdMap.values().stream()
                .forEach(e -> {
                    out.print(e.getTitle() + DELIMETER + e.getDirector() + DELIMETER + e.getStudio()
                            + DELIMETER + e.getMpaa() + DELIMETER + e.getId() + DELIMETER + e.getReleaseDate() + DELIMETER);
                    e.getNotes().stream().forEach(n -> out.print(n+"~~"));
                    out.println();
                    out.flush();
                });
        out.println();
        
        out.close();
    }
    
    
    @Override
    public void load() throws Exception{
        String[] array = new String[7];
        
        
        String nextLine= "";
        Scanner sc = new Scanner(new BufferedReader(new FileReader("dvd.txt")));
        
        while(sc.hasNext()){
            Dvd dvd = new Dvd();
            nextLine = sc.nextLine();
            array = nextLine.split(DELIMETER);
            dvd.setTitle(array[0]);
            dvd.setDirector(array[1]);
            dvd.setStudio(array[2]);
            dvd.setMpaa(array[3]);
            dvd.setId(array[4]);
            dvd.setReleaseDate(LocalDate.parse(array[5]));
            String[] str = array[6].split("~~");
            ArrayList<String> al = new ArrayList<>();
            al.addAll(Arrays.asList(str));            
            dvd.setNotes(al);
            dvdMap.put(dvd.getId(), dvd);
            if(Integer.parseInt(dvd.getId())> id){
                id = Integer.parseInt(dvd.getId());
            }
        }   
    }
}
