package com.swingy.controller.aid;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import com.swingy.controller.aid.MainFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import jdk.vm.ci.amd64.AMD64Kind;

public class MainFrame extends JFrame implements KeyListener{

    //public Villians villian;
    public HeroControl hero;
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            //System.out.println("Left Key Pressed");
            //this.laugh();
            hero.moveLeft();
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            hero.moveRight();
        if (e.getKeyCode() == KeyEvent.VK_UP)
            //System.out.println("UP Key Pressed");
            hero.moveUp();
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            //System.out.println("DOWN Key Pressed");
            hero.moveDown();
    }
    public void keyReleased(KeyEvent e){
        System.out.println("");
    }
    public void keyTyped(KeyEvent e){
        System.out.println("");
    }

    public void laugh(){
        System.out.println("Hahahahahahahah");
    }

    MainFrame(){
        this.hero = new HeroControl(100);
         //villian = new Villians(150);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    public void  heroExec(){
        MainFrame frame = new MainFrame();

        frame.getContentPane().add(frame.hero);
        //frame.getContentPane().add(frame.villian);

        frame.setSize(600, 600);
        frame.setBackground(Color.BLACK);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}