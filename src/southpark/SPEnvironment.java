/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package southpark;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Colin
 */
class SPEnvironment extends Environment {

    
    Kenny kennyBig, kennySmall;

    public SPEnvironment() {
        kennyBig = new Kenny(150, 50, 500, 250);
        kennySmall= new Kenny(500, 25, 250, 125);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
       if (kennyBig != null){
           kennyBig.setX(e.getX());
           kennyBig.setY(e.getY());
       }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (kennyBig != null) {
            kennyBig.draw(graphics);
        }
        if (kennySmall != null){
            kennySmall.draw(graphics);
        }
    }

    
}
