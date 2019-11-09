package com.swingy.controller.aid;

import javax.swing.*;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeroControl extends JComponent {

    public int x;
    public int y;
    public int dimensions;

    HeroControl(int size){
        this.dimensions = size;
        this.x = 250;
        this.y = 200;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.PINK);
        g.drawRect(x, y,dimensions, dimensions);
        g.fillRect(x, y,dimensions, dimensions);

        g.setColor(Color.BLACK);
        g.drawRect(15,20, 550,500);

        g.setColor(Color.red);
        g.drawOval(500,400,50,60);
        g.fillOval(500,400,50,60);

        g.setColor(Color.red);
        g.drawOval(20,40,50,60);
        g.fillOval(20,40,50,60);

        g.setColor(Color.red);
        g.drawOval(20,40,50,60);
        g.fillOval(20,420,50,60);

        g.setColor(Color.red);
        g.drawOval(20,40,50,60);
        g.fillOval(400,20,50,60);

        g.setColor(Color.red);
        g.drawOval(40,200,50,60);
        g.fillOval(40,200,50,60);

        g.setColor(Color.red);
        g.drawOval(500,200,50,60);
        g.fillOval(500,200,50,60);

        g.setColor(Color.black);
        g.drawOval(300,400,50,60);
        g.fillOval(300,400,50,60);

        g.setColor(Color.black);
        g.drawOval(250,40,50,60);
        g.fillOval(250,40,50,60);
    }

    void moveRight(){
        this.x += 15;
        repaint();
    }
    void moveLeft(){
        this.x -= 15;
        repaint();
    }
    void moveDown(){
        this.y += 15;
        repaint();
    }
    void moveUp(){
        this.y -= 15;
        repaint();
    }
}
