/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.Dvd;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface MovieDao {
    public List getAllMovies();
    public Dvd getMovie(int id);
    public void addMovie(Dvd movie);
    public int getInventory(int id);
    public void setInventory(Dvd dvd);
   public List<Integer> getGenresByDvdId(Dvd dvd);
   public List<String> getGenres(List<Integer> genreIds);
   public void deleteDvd(int id);
   public void editMovie(Dvd dvd);
}
