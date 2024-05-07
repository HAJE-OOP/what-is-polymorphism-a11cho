package org.haje.ducks;

import java.awt.*;

public class RubberDuck {
    public int x;
    public int y;

    public RubberDuck(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d) {
        // Body
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(x, y, 120, 80);

        // Head
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(x + 90, y - 30, 60, 60);

        // Beak
        g2d.setColor(Color.ORANGE);
        Polygon beak = new Polygon();
        beak.addPoint(x + 140, y);
        beak.addPoint(x + 160, y - 10);
        beak.addPoint(x + 160, y + 10);
        g2d.fill(beak);

        // Eye
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x + 120, y - 10, 10, 10);

        // Highlight
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x + 122, y - 8, 5, 5);
    }
}