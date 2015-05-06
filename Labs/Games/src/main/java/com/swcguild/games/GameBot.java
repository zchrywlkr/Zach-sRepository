/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.games;

import java.io.FileNotFoundException;

/**
 *
 * @author apprentice
 */
public interface GameBot  {
    public void run() throws FileNotFoundException;
    public String name();
    
}
