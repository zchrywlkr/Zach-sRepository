/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstream.Dao;

import com.swcguild.dvdlibrarywithstream.Dto.Dvd;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface DvdDao {
    public void addDvd(Dvd dvd);
    public void removeDvd(Dvd dvd);
    public List<Dvd> findlastnYears(int n);
    public List<Dvd> findMpaaRating(String mpaa);
    public Map<String,List<Dvd>> findDirector(String director);
    public List<Dvd> findStudio(String studio);
    public double getAverageAge();
    public List<Dvd> getNewestMovie();
    public List<Dvd> getOldest();
    public double getAverageNumNotes();
    public List<Dvd> getAllDvds();
    public Dvd getDvd(String id);
    public void save() throws Exception;
    public void load() throws Exception;
}
