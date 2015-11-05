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

//        HOOD
        int[] xC = new int[5];
        xC[0] = x + (width * 27 / 100);
        xC[1] = x + (width * 12 / 100);
        xC[2] = x + (width * 6 / 100);
        xC[3] = x + (width * 4 / 100);
        xC[4] = x + (width * 27 / 100);

        int[] yC = new int[5];
        yC[0] = y + (height * 40 / 100);
        yC[1] = y + (height * 46 / 100);
        yC[2] = y + (height * 51 / 100);
        yC[3] = y + (height * 58 / 100);
        yC[4] = y + (height * 58 / 100);

        int[] xA = new int[5];
        xA[0] = x + (width * 73 / 100);
        xA[1] = x + (width * 88 / 100);
        xA[2] = x + (width * 94 / 100);
        xA[3] = x + (width * 96 / 100);
        xA[4] = x + (width * 73 / 100);

        int[] yA = new int[5];
        yA[0] = y + (height * 40 / 100);
        yA[1] = y + (height * 46 / 100);
        yA[2] = y + (height * 51 / 100);
        yA[3] = y + (height * 58 / 100);
        yA[4] = y + (height * 58 / 100);

        graphics.setColor(new Color(255, 128, 0));
        graphics.fillPolygon(xC, yC, 5);
        graphics.fillPolygon(xA, yA, 5);
        graphics.fillRect(x + (width * 17 / 100), y + (height * 40 / 100), width * 60 / 100, height * 16 / 100);
        graphics.fillRect(x + (width * 15 / 100), y + (height * 52 / 100), width * 706 / 1000, height * 18 / 100);
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
        graphics.drawLine(x + (width * 50 / 100), y + (height * 39 / 100), x + (width * 43 / 100), y + (height * 47 / 100));
        graphics.drawLine(x + (width * 50 / 100), y + (height * 39 / 100), x + (width * 56 / 100), y + (height * 48 / 100));
        //zipper
        graphics.fillRect(x + (width * 50 / 100), y + (height * 50 / 100), width * 1 / 100, height * 14 / 100);
        //eyes
        graphics.fillOval(x + (width * 47 / 100), y + (height * 198 / 1000), width * 4 / 100, height * 2 / 100);
        graphics.fillOval(x + (width * 512 / 1000), y + (height * 20 / 100), width * 4 / 100, height * 2 / 100);
        graphics.drawOval(x + (width * 12 / 100), y + (height * 7 / 100), width * 78 / 100, height * 36 / 100);
        //innerarms
        graphics.drawLine(x + (width * 83 / 100), y + (height * 50 / 100), x + (width * 88 / 100), y + (height * 60 / 100));
        graphics.drawLine(x + (width * 18 / 100), y + (height * 50 / 100), x + (width * 13 / 100), y + (height * 60 / 100));
        //Hands
        graphics.setColor(new Color(153, 76, 0));
        graphics.fillOval(x + (width * 3 / 100), y + (height * 55 / 100), width * 12 / 100, height * 6 / 100);
        graphics.fillOval(x + (width * 85 / 100), y + (height * 55 / 100), width * 12 / 100, height * 6 / 100);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 557 / 1000), width * 6 / 100, height * 3 / 100);
        graphics.fillOval(x + (width * 84 / 100), y + (height * 557 / 1000), width * 6 / 100, height * 3 / 100);
        //FEET
        graphics.setColor(new Color(0, 0, 0));

        graphics.fillOval(x + (width * 12 / 100), y + (height * 67 / 100), width * 38 / 100, height * 7 / 100);
        graphics.fillOval(x + (width * 49 / 100), y + (height * 665 / 1000), width * 38 / 100, height * 7 / 100);


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
