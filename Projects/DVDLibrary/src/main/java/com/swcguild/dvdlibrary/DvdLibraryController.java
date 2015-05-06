package com.swcguild.dvdlibrary;
import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.dvdlibrary.dao.DvdLibrary;
import com.swcguild.dvdlibrary.dto.DVD;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class DvdLibraryController {
    ConsoleIO io = new ConsoleIO();
    DvdLibrary library = new DvdLibrary();
    String userInput = "";     
    ArrayList<DVD> movies = new ArrayList<>();
    public void run() throws FileNotFoundException, IOException{
        library.load();
        boolean keepGoing = true;
       
        while(keepGoing){
             printMenu();
            switch(userInput){
                case "1": addDVD();break;
                case "2": removeDVD(); break;
                case "3": editDVD(); break;
                case "4": listLibrary(); break;
                case "5": findDVD(); break;
                case "6": keepGoing = false; break;
                default : io.printString("unkown command");
            }
            library.save();
        }
    }
    private void printMenu() {
        io.printString("DVD Library \r \t1) add DVD to library \r\t2) remove DVD from libary\r\t3) editDVD");
        io.printString("\t4)list libary\r\t5) find DVD \r\t6) exit");
        userInput = io.scanString("");
    }
    private void addDVD() {
        library.addDVD(new DVD(io.scanString("please enter title"),io.scanString("please enter release date"),io.scanString("mpaa rating"),io.scanString("director"),io.scanString("studio"),io.scanString("user rating")));
    }
    private void removeDVD() {
        findDVD();
        userInput = io.scanString("enter the dvd to delete");
        library.removeDVD(movies.get(Integer.parseInt(userInput)).getId());  
    }
    private void editDVD() {
        findDVD();
        userInput = io.scanString("enter the dvd to edit");
        DVD dvd = movies.get(Integer.parseInt(userInput));

            io.printString("1: Title " + dvd.getTitle() );
            io.printString("2: release date " + dvd.getReleaseDate());
            io.printString("3: mpaa rating "+ dvd.getMpaaRating());
            io.printString("4: director " + dvd.getDirector());
            io.printString("5: studio " + dvd.getStudio());
            io.printString("6: User rating " + dvd.getUserRating());
            io.printString("");
            
            userInput = io.scanString("enter field you want to edit");
            switch(userInput){
                case "1": dvd.setTitle(io.scanString("DVD title"));break;
                case "2": dvd.setReleaseDate(io.scanString("release date")); break;
                case "3": dvd.setMpaaRating(io.scanString("mpaa rating")); break;
                case "4": dvd.setDirector(io.scanString("director")); break;
                case "5": dvd.setStudio(io.scanString("studio"));break;
                case "6": dvd.setUserRating(io.scanString("User rating")); break;
            }
    }
    private void listLibrary() {
        
        for(DVD dvd: library.getMovies().values()){
            io.printString("Title " + dvd.getTitle() );
            io.printString("release date " + dvd.getReleaseDate());
            io.printString("mpaa rating "+ dvd.getMpaaRating());
            io.printString("director " + dvd.getDirector());
            io.printString("studio " + dvd.getStudio());
            io.printString("User rating " + dvd.getUserRating());
            io.printString("");
        }
    }
    private void findDVD() {
         movies = library.findDVD(io.scanString("enter the title of the movie"));
         int num = 0;
        for(DVD dvd: movies){
            io.printString("Dvd : " + num);
            io.printString("Title " + dvd.getTitle() );
            io.printString("release date " + dvd.getReleaseDate());
            io.printString("mpaa rating "+ dvd.getMpaaRating());
            io.printString("director " + dvd.getDirector());
            io.printString("studio " + dvd.getStudio());
            io.printString("User rating " + dvd.getUserRating());
            io.printString("");
            num++;
        }
    }
}