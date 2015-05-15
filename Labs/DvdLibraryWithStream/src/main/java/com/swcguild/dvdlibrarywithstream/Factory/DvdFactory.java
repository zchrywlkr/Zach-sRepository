/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstream.Factory;

import com.swcguild.dvdlibrarywithstream.Dto.Dvd;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class DvdFactory {
    public Dvd buildDvd(String title,String mpaa, String director, String studio, String release,LocalDate date){
        Dvd dvd = new Dvd();
        dvd.setTitle(title);
        dvd.setMpaa(mpaa);
        dvd.setReleaseDate(date);
        dvd.setDirector(director);
        ArrayList<String> list = new ArrayList<>();
        dvd.setNotes(list);
        dvd.setStudio(studio);
        
        return dvd;
    }
    
}
