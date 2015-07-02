
package com.swcguild.iteration2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author warde
 */
public class Iteration2 {
    
    public static void main(String[] args) {
        HashMap<String, String> footballTeams = new HashMap<>();
        
        footballTeams.put("Cleveland", "Browns");
        footballTeams.put("Pittsburgh", "Steelers");
        footballTeams.put("Minneapolis", "Vikings");
        footballTeams.put("Kansas City", "Chiefs");
        
        Set<String> cityNames = footballTeams.keySet();
        
        for(String currentCity: cityNames) {
            System.out.println("City: " + currentCity + " " + "Team: " + footballTeams.get(currentCity));
        }
        
        Iterator<String> iter = cityNames.iterator();
        
        while(iter.hasNext()) {
            String currentCity = iter.next();
            System.out.println("City: " + currentCity + " Team: " + footballTeams.get(currentCity));
        }
        
        Set< Entry<String, String> > mapEntries = footballTeams.entrySet();
        
        for (Entry<String, String> currentEntry : mapEntries) {
            System.out.println("City: " + currentEntry.getKey() + " Team: " + currentEntry.getValue());
        }
        
    }

}
