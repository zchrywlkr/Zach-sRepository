
package com.swcguild.addressbook2.Controller;

import com.swcguild.addressbook2.Dao.AddressDao;
import com.swcguild.addressbook2.Dao.AddressDaoFileImpl;
import com.swcguild.addressbook2.Dto.Address;
import com.swcguild.addressbook2.Factory.AddressFactory;
import com.swcguild.consoleio.ConsoleIO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Controller {
    AddressDao dao = new AddressDaoFileImpl();
    ConsoleIO io = new ConsoleIO();
    AddressFactory factory = new AddressFactory();
    public void run() {
        dao.load();
        String input;
        do {
            input = io.scanString(menu());
            switch (input) {
                case "1":addAddress();break;
                case "2":editAdddress();break;
                case "3":removeAddress();break;
                case "4":search(1);break;
                case "5":search(2);break;
                case "6":searchState();break;
                case "7":search(3); break;
                case "8":showAllAddresses(); break;
                case "9": break;
                default:io.printString("input invalid");
            }
        } while (!input.equals("9"));
        dao.save();
        
    }
    private String menu() {
        return "\tAddress Book \r1)add address\r2)edit address \r3) removeAddress \r4)Search by last name\r5)search by city\r6)search by state\r7)search by zip\r8)Show all addres\r9)exit";
    }
    private void addAddress() {
        String last = "";
        String first = "";
        String zip = "";
        String state = "";
        String city = "";
        String street = "";
        first = io.scanString("enter First name");
        last = io.scanString("enter Last Name");
        street = io.scanString("enter Street");
        city = io.scanString("enter city");
        state = io.scanString("enter state");
        zip = io.scanString("enter zip");

        Address address = factory.buildAddress(first, last, street, city, state, zip);
        dao.addAddress(address);
    }
    private void editAdddress() {
        int num = io.scanInt(1,4,"enter search type " + searchMenu());
        List<Address> list = search(num);
        if(list.size()>0){
            int input = io.scanInt(0, list.size(), "Enter number of address to remove");
            Address address = list.get(input);
            
             String last = "";
        String first = "";
        String zip = "";
        String state = "";
        String city = "";
        String street = "";
        first = io.scanString("enter First name or hit enter to keep "+address.getFirstName());
        last = io.scanString("enter Last Name or hit enter to keep "+address.getLastName());
        street = io.scanString("enter Street or hit enter to keep "+address.getStreet());
        city = io.scanString("enter city or hit enter to keep "+address.getCity());
        state = io.scanString("enter state or hit enter to keep " +address.getState());
        zip = io.scanString("enter zip or hit enter to keep " + address.getZipCode());
        
        if(!first.equals("")){
            address.setFirstName(first);
        }
        if(!last.equals("")){
            address.setLastName(last);
        }
        if(!street.equals("")){
            address.setStreet(street);
        }
        if(!city.equals("")){
            address.setCity(city);
        }
        if(!state.equals("")){
            address.setState(state);
        }
        if(!zip.equals("")){
            address.setZipCode(zip);
        }
        dao.addAddress(address);
            
        }else{
            io.printString("no address found");
        }
        
    }
    private void removeAddress() {
        int num = io.scanInt(1,4,"enter search type " + searchMenu());
        List<Address> list = search(num);
        if(list.size()>0){
            int input = io.scanInt(0, list.size(), "Enter number of address to remove");
            Address address = list.get(input);
            dao.removeAddress(address);
        }else{
            io.printString("no address found");
        }
    }
    private void searchState() {
        Map<String,List<Address>> map = new HashMap<>();
        String input = io.scanString("enter State");
        map = dao.searchState(input);

          map.entrySet().stream().forEach((Entry<String,List<Address>> e) -> {
              io.printString(e.getKey());
              e.getValue().stream().forEach(a -> printAddress(a));
                  });
    }
    private String printAddress(Address e) {
        return (e.getFirstName() + " " + e.getLastName()
                + "\r" + e.getStreet() + " " + e.getCity() + " " + e.getState() + " " + e.getZipCode());
    }
    private List<Address> search(int num) {
        List<Address> list = new ArrayList<>();
        String input;
        switch (num) {
            case 2:input = io.scanString("enter city");list = dao.searchCity(input);break;
            case 1:input = io.scanString("enter Last Name");list = dao.searchLastName(input);break;
            case 3:input = io.scanString("enter zip code");list = dao.searchZipCode(input);break;
            case 4: list = dao.getAllAddresses();
            default:io.printString("error");
        }
        for (int i = 0; i < list.size(); i++) {
            io.printString(i + ") " + printAddress(list.get(i)));
        }
        if(list.isEmpty()){
            io.printString("No addresss found");
        }
        return list;
    }
    private String searchMenu() {
       return ("\r1) search last name\r2) search city\r3) search zip code/4)all addresses");
    }
    private void showAllAddresses() {
        dao.getAllAddresses().stream().forEach(e -> io.printString(printAddress(e)));
    }
}


//    private class SearchCity{
//        List<Address> list = new ArrayList<>();
//        public SearchCity(String str) {
//            String input = io.scanString(str);
//            list = dao.searchCity(input);   
//        }
//            public List<Address> search() {
//            String input ="";
//            for(int i =0; i< list.size(); i++){
//                io.printString(i+") "+printAddress(list.get(i)));
//            }
//            return list;
//        }
//    }
//        private class searchLastName extends SearchCity{
//        public searchLastName(String str) {
//            super(str);
//            String input = io.scanString(str);
//            list = dao.searchLastName(input);
//        }
//    }
//        private class searchZip extends SearchCity{
//        public searchZip(String str) {
//            super(str);
//            String input = io.scanString(str);
//            list = dao.searchZipCode(input);
//        }
//    }
    //        String input ="";
//        List<Address> list = new ArrayList<>();
//        input = io.scanString("enter last name of address");
//        list = dao.searchLastName(input);
//        
//        for(int i =0; i< list.size(); i++){
//            io.printString(i+") "+printAddress(list.get(i)));
//        }
//        return list;

//        search(dao.searchLastName());
    