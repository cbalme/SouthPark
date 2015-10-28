/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package southpark;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Colin
 */
public class Kenny {

    public void draw(Graphics graphics) {
        graphics.setColor(new Color(255, 255, 255, 155));
        graphics.drawRect(x, y, width, height);

        int[] xS = new int[3];
        xS[0] = x + (width / 2);
        xS[1] = x + (width / 30);
        xS[2] = x + (width * 39 / 40);

        int[] yS = new int[3];
        yS[0] = y;
        yS[1] = y + (height * 2 / 3);
        yS[2] = y + (height * 2 / 3);

        int[] xC = new int[3];
        xC[0] = x + (width / 2);
        xC[1] = x + (width * 2 / 30);
        xC[2] = x + (width * 380 / 400);

        int[] yC = new int[3];
        yC[0] = y;
        yC[1] = y + (height * 4 / 7);
        yC[2] = y + (height * 4 / 7);



//        HOOD
        graphics.setColor(new Color(255, 128, 0));
        graphics.fillPolygon(xC, yC, 3);
        graphics.fillPolygon(xS, yS, 3);
        graphics.fillOval(x, y, width, width);
        graphics.setColor(new Color(153, 76, 0));
        graphics.drawOval(x, y, width, width);
        graphics.setColor(new Color(153, 76, 0));
        graphics.fillOval(x + (width * 17 / 100), y + (height * 9 / 100), width * 67 / 100, height * 30 / 100);
//        TORSO
//        Graphics2D g2d = (Graphics2D) graphics;
//        g2d.rotate(Math.toRadians(45));
        graphics.setColor(new Color(255, 128, 0));
//        g2d.fillOval(x + (width * 45 / 100), y + (height * 9 / 100), width * 30 / 100, height * 45 / 100);
//        g2d.rotate(Math.toRadians(-45));
//       FACE 
        graphics.setColor(new Color(255, 255, 204));
        graphics.fillOval(x + (width * 31 / 100), y + (height * 9 / 100), width * 40 / 100, height * 30 / 100);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 318 / 1000), y + (height * 15 / 100), width * 20 / 100, height * 10 / 100);
        graphics.fillOval(x + (width * 510 / 1000), y + (height * 16 / 100), width * 20 / 100, height * 10 / 100);
        graphics.setColor(Color.black);

        
        //cord
        graphics.drawLine(x + (width * 50 / 100), y + (height * 39 / 100), x + (width * 43 / 100),  y + (height * 47 / 100));
        graphics.drawLine(x + (width * 50 / 100), y + (height * 39 / 100), x + (width * 56 / 100),  y + (height * 48 / 100));
        
        
        graphics.fillOval(x + (width * 47 / 100), y + (height * 198 / 1000), width * 4 / 100, height * 2 / 100);
        graphics.fillOval(x + (width * 512 / 1000), y + (height * 20 / 100), width * 4 / 100, height * 2 / 100);
        graphics.drawOval(x + (width * 12 / 100), y + (height * 7 / 100), width * 78 / 100, height * 36 / 100);

    }

    public Kenny(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private int x;
    private int y;
    private int height;
    private int width;

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }
}
