
package com.swcguild.serverinventory;

import com.swcguild.serverinventory.controller.ServerInventoryController;

/**
 *
 * @author warde
 */
public class App {
    
    public static void main(String[] args) {
        ServerInventoryController ctl = new ServerInventoryController();
        ctl.run();
    }

}
