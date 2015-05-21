package com.swcguild.dvdlibrarywithdependencies.Controller;
import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
public class DvdController {
    DvdLibraryDao dao;
    ConsoleIO io;
// ctx.getBean("dao",DvdDaoDummyImpl.class);
    public DvdController(DvdLibraryDao dao,ConsoleIO io) {
        this.dao = dao;
        this.io = io;
    }
    public void run(){
        int num =0;
        do {
            try{
            num= io.scanInt(1,7,("1) enter dvd\r2) remove dvd\r3) list all \r4) list by title\r5)list by rating\r6) list by studio"));
            switch(num){
                case 1: addDvd(); break;
                case 2 : removeDvd(); break;
                case 3: listAll(); break;
                case 4: getTitle(); break;
                case 5: getRating(); break;
                case 6: getStudio(); break;
                case 7: break;
                default : System.out.println("error");
            }
            }catch(Throwable e){
                System.out.println("error");
            }
        } while (num != 7);   
    }
    private void addDvd() {
        Dvd dvd = new Dvd();
        dvd.setTitle(io.scanString("enter title"));
        dvd.setDirector(io.scanString("enter director"));
        dvd.setMpaaRating(io.scanString("enter ratting"));
        dvd.setNote(io.scanString("enter notes"));
        dvd.setStudio(io.scanString("enter studio"));
        dvd.setReleaseDate(LocalDate.parse(io.scanString("enter date")));
        dao.add(dvd);
    }
    private void listAll() {
        dao.listAll().stream().forEach(e -> printDvd(e) );
    }
    private void removeDvd() {
        dao.remove(io.scanInt("enter id"));
    }
    private void getTitle() {
        String input = io.scanString("enter title");
        dao.listAll().stream().filter(e -> e.getTitle().equalsIgnoreCase(input)).forEach(d -> printDvd(d));
    }
    private void getRating() {
        String input = io.scanString("enter rating");
        dao.listAll().stream().filter(e -> e.getTitle().equalsIgnoreCase(input)).forEach(d -> printDvd(d));
    }
    private void getStudio() {
        String input = io.scanString("enter studio");
        dao.listAll().stream().filter(e -> e.getTitle().equalsIgnoreCase(input)).forEach(d -> printDvd(d));
    }
    public void printDvd(Dvd d){
        System.out.println("id: " + d.getId() + "\rtitle "+ d.getTitle()+"\rmpaa rating: "+d.getMpaaRating()+"\rDirector "+d.getDirector()+"\r studio "+d.getStudio()+"\r notes "+ d.getNote());
    }
}
