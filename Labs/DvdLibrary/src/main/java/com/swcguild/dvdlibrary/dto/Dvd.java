
package com.swcguild.dvdlibrary.dto;

import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
/**
 *
 * @author warde
 */
public class Dvd {
    
    private int id;
//    @NotEmpty(message="you must supply a value for the title.")
//    @Length(max=50,message=" must be under 50 characters")
    private String title;
//    @NotNull(message="Please enter a date")
//    @Past (message="Only the past is valid")
//    @DateTimeFormat(pattern = "dd/MM/yy")
    private String releaseDate;
//    @NotEmpty(message="you must supply a value for the mpaa rating.")
//    @Length(max=50,message="must be under 50 characters")
    private String mpaaRating;
//   @NotEmpty(message="you must supply a value for the director.")
//    @Length(max=50,message=" must be under 50 characters")
    private String director;
//    @NotEmpty(message="you must supply a value for the studio.")
//    @Length(max=50,message=" must be under 50 characters")
    private String studio;
    private String note;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
