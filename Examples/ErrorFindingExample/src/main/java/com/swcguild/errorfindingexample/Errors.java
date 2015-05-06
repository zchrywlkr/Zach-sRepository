
package com.swcguild.errorfindingexample;

import java.util.ArrayList;


public class Errors {
    ArrayList<String> myList = new ArrayList<>();
    public int countMyList(){
        myList.add("String one");
        myList.add("String two");
        return myList.size();
    }
}
