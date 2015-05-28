/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary.dto;

import java.time.LocalDate;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author apprentice
 */
public class SpringDvd extends Dvd{
    
    private int id;
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=50,message="first name must be under 50 characters")
    private String title;
  
    private LocalDate releaseDate;
//    @NotEmpty(message="you must supply a value for the mpaaRate.")
//    @Length(max=50,message="first name must be under 50 characters")
    private String mpaaRating;
//    @NotEmpty(message="you must supply a value for the direcotr.")
//    @Length(max=50,message="first name must be under 50 characters")
    private String director;
//    @NotEmpty(message="you must supply a value for the studio.")
//    @Length(max=50,message="first name must be under 50 characters")
    private String studio;
//    @Length(max=50,message="first name must be under 50 characters")
    private String note;
}
