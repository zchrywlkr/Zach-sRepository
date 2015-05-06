/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.games.wof;

/**
 *
 * @author apprentice
 */
public class Phrase {
    private String phrase ="";
    private String category = "";

    public Phrase(String phrase, String category) {
        this.phrase = phrase;
        this.category = category;
    }

    public String getPhrase() {
        return phrase;
    }

    public String getCategory() {
        return category;
    }
    
}
