/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstream.Controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.dvdlibrarywithstream.Dao.DvdDao;
import com.swcguild.dvdlibrarywithstream.Dao.DvdDaoDummyImpl;
import com.swcguild.dvdlibrarywithstream.Dto.Dvd;
import com.swcguild.dvdlibrarywithstream.Factory.DvdFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author apprentice
 */
public class Controller {

    DvdDao dao = new DvdDaoDummyImpl();
    ConsoleIO io = new ConsoleIO();
    DvdFactory factory = new DvdFactory();
    List<Dvd> list = new ArrayList<>();
    Map<String, List<Dvd>> map = new HashMap<>();

    public void run() throws Exception {
        dao.load();
        String input;
        do {
            input = io.scanString(menu());

            switch (input) {
                case "1":
                    addDvd();
                    break;
                case "2":
                    editDvd();
                    break;
                case "3":
                    removeDvd();
                    break;
                case "4":
                    search(1);
                    break;
                case "5":
                    search(2);
                    break;
                case "6":
                    search(7);
                    break;
                case "7":
                    search(3);
                    break;
                case "8":
                    averageAgeDvds();
                    break;
                case "9":
                    search(4);
                    break;
                case "10":
                    search(5);
                    break;
                case "11":
                    averageNotes();
                    break;
                case "12":
                    search(6);
                    break;
                case "13":
                    break;
                default:
                    io.printString("bad input");
                    break;
            }
        } while (!input.equals("13"));
        dao.save();
    }

    private String menu() {
        return ("\tDvd library \r1) add dvd\r2)edit dvd\r3)remove dvd\r4)get dvd \r5) search by mpaa"
                + "\r6) search by direcotr\r7)search by studio\r8) get average age of dvds \r9)get newest Dvds\r10)get oldest dvd"
                + "\r11)get average number of notes\r12show all dvds\r13) exit");
    }

    private void addDvd() {
        String title = io.scanString("enter title");
        String mpaa = io.scanString("enter mpaa rating");
        String director = io.scanString("enter director");
        String studio = io.scanString("Enter Studio");
        LocalDate release = io.scanLocalDate("enter release date");
        Dvd dvd = factory.buildDvd(title, mpaa, director, studio, mpaa, release);
        String note = "";
        do {
            note = io.scanString("enter note or hit enter to continue");
            if (!note.equals("")) {
                dvd.getNotes().add(note);
            }
        } while (!note.equals(""));
        dao.addDvd(dvd);
    }

    private void editDvd() {
        Dvd dvd = new Dvd();
        LocalDate releaseDate;
        StringBuilder sb = new StringBuilder();
        boolean exit = true;
        do {
            dvd = getDvd();
            if (Integer.parseInt(dvd.getId()) > 0) {
                dao.removeDvd(dvd);
            }

        } while (dvd.getId().equals("-2") && dao.getAllDvds().size() > 0);
        if (!dvd.getId().equals("-3")) {

            String title = io.scanString("enter title or hit enter to keep " + dvd.getTitle());
            String mpaa = io.scanString("enter mpaa rating " + dvd.getMpaa());
            String director = io.scanString("enter director " + dvd.getDirector());
            String studio = io.scanString("Enter Studio " + dvd.getStudio());

            for (String str : dvd.getNotes()) {
                sb.append("\r\t").append(str);
            }
            String keepNotes = io.scanString(sb.toString() + "\redit notes? y/n");
            if (keepNotes.equalsIgnoreCase("y")) {
                dvd.setNotes(editNotes(dvd.getNotes()));
            }

            do {
                exit = true;

                String release = io.scanString("enter release date form yyyy-dd-mm");
                if (!release.equals("")) {
                    try {
                        releaseDate = LocalDate.parse(release);
                    } catch (Exception e) {
                        io.printString("must enter date form yyyy-dd-mm");
                        exit = false;
                    }

                }

            } while (!exit);

            if (!title.equals("")) {
                dvd.setTitle(title);
            }
            if (!mpaa.equals("")) {
                dvd.setMpaa(mpaa);
            }
            if (!director.equals("")) {
                dvd.setDirector(director);
            }
            if (!studio.equals("")) {
                dvd.setStudio(studio);
            }
        }
    }

    private void removeDvd() {
        Dvd dvd = new Dvd();
        do {
            dvd = getDvd();
            if (Integer.parseInt(dvd.getId()) > 0) {
                dao.removeDvd(dvd);
            }

        } while (dvd.getId().equals("-2") && dao.getAllDvds().size() > 0);
    }

    private void averageAgeDvds() {
        io.printString("average age of dvds: " + dao.getAverageAge());
    }

    private void averageNotes() {
        io.printString("average number of notes: " + dao.getAverageNumNotes());
    }

    private void search(int num) {
        list = new ArrayList<>();
        map = new HashMap<>();
        String str = "";
        switch (num) {
            case 1:
                str = io.scanString("enter year");
                list = dao.findlastnYears(Integer.parseInt(str));
                break;
            case 2:
                str = io.scanString("Mpaa");
                list = dao.findMpaaRating(str);
                break;
            case 3:
                str = io.scanString("Studio");
                list = dao.findStudio(str);
                break;
            case 4:
                list = dao.getNewestMovie();
                break;
            case 5:
                list = dao.getOldest();
                break;
            case 6:
                list = dao.getAllDvds();
                break;
            case 7:
                str = io.scanString("enter director");
                map = dao.findDirector(str);
                break;
            case 8:
                break;
            default:
                io.printString("Error");
                break;
        }
        if (num <= 6) {
            list.stream().forEach(e -> io.printString(printDvd(e)));
        } else if (num == 7) {
            map.entrySet().stream().forEach((Entry<String, List<Dvd>> e) -> {
                io.printString(e.getKey());
                e.getValue().stream().forEach(d -> io.printString("/t " + printDvd(d)));
            });
        }
    }

    private String printDvd(Dvd d) {
        StringBuilder sb = new StringBuilder();
        sb.append("\r").append(d.getId()).append(" ").append(d.getTitle()).append("\rMpaa:").append(d.getMpaa()).append("\rdirector: ").append(d.getDirector()).append("\rstudio: ").append(d.getStudio()).append("\rRelease: ").append(d.getReleaseDate()).append("\r notes: ");
        for (String str : d.getNotes()) {
            sb.append("\r\t").append(str);
        }
        return sb.toString();
    }

    private String searchMenu() {
        return ("Search by: \r1)last n years\r2)mpaa rating\r3)studio\r4)newestMovies\r5)oldestMoves\r6)allDvds\r7)director\r8)exit");
    }

    private Dvd getDvd() {
        Dvd dvd = new Dvd();
        int search = io.scanInt(1, 8, searchMenu());
        if (search == 8) {
            
            return null;
        }
        search(search);
        int id = io.scanInt(0, dao.getAllDvds().size(), "enter Dvd number of enter 0 to exit");

        if (id == 0) {
            dvd.setId("-3");
            return dvd;
        }
        try {
            
            String input = io.scanString(printDvd(dao.getDvd(String.valueOf(id))) + "\rdo you want select this dvd (y/n)");
            if (input.equalsIgnoreCase("y")) {
                io.printString("yes confirmed");
                dvd = dao.getDvd(String.valueOf(id));
                return dvd;
            } else {
                dvd.setId("-2");
                io.printString("no action taken");
            }
        } catch (Exception e) {
            io.printString("no dvd  with that id");
            dvd.setId("-2");
        }
        return dvd;
    }

    private ArrayList<String> editNotes(ArrayList<String> notes) {
        int input = 0;
        int input2 = 0;
        do {
            input = io.scanInt(0, 2, "0) exit 1) add 2) edit/remove");
            if (input == 0) {
                break;
            } else if (input == 1) {
                notes.add(io.scanString("enter new note"));
            } else {

                for (int i = 0; i < notes.size(); i++) {
                    io.printString((i + 1) + " " + notes.get(i));
                }
                input = io.scanInt(0, notes.size(), "enter field to edit/delete or 0 to exit");
                if (input == 0) {
                    break;
                }

                input2 = io.scanInt(1, 2, "1) delete 2)edit");
                if (input2 == 1) {
                    notes.remove(input - 1);
                } else {
                    notes.add(io.scanString(notes.get(input - 1)));
                    notes.remove(input - 1);
                }
            }
        } while (input != 0);
        return notes;
    }
}
