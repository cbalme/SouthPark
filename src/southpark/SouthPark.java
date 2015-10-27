/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package southpark;

import environment.ApplicationStarter;

/**
 *
 * @author Colin
 */
public class SouthPark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("South Park", new SPEnvironment());
    }
    
}
