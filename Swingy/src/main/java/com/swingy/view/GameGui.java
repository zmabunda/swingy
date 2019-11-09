package com.swingy.view;

import com.swingy.controller.aid.AppSwingy;

import javax.swing.*;
import java.awt.*;


public class GameGui  implements InterfaceGui {

    Font font = new Font("Times new Roman", Font.BOLD, 20);
public JButton choicebtn1, choicebtn2, choicebtn3, choicebtn4, choicebtn5, choicebtn6;
public JFrame windowGame;
public JPanel gameInstruction;
public JLabel gameInstLable, navInstruction;
public JPanel btnsPanel, navPanel;
public JButton playGame;


    public void theGui(AppSwingy.GuiChoice cntrl){

        windowGame = new JFrame();

        windowGame.setSize(800, 600);
        windowGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowGame.getContentPane().setBackground(Color.darkGray);
        windowGame.setLayout(null);

        gameInstruction = new JPanel();
        gameInstruction.setBounds(150, 100, 550, 200);
        gameInstruction.setBackground(Color.darkGray);
        gameInstruction.setLayout(new GridLayout(4, 1));
        windowGame.add(gameInstruction);

        gameInstLable = new JLabel("You have encountered a villain, pick an option");

        gameInstLable.setFont(font);
        gameInstLable.setForeground(Color.white);
        gameInstruction.add(gameInstLable);

        btnsPanel = new JPanel();

        btnsPanel.setBounds(250, 300, 350, 150);
        btnsPanel.setBackground(Color.darkGray);
        btnsPanel.setLayout(new GridLayout(4, 1));
        windowGame.add(btnsPanel);

        navPanel = new JPanel();

        navPanel.setBounds(10, 40, 550, 200);
        navPanel.setBackground(Color.darkGray);
        navPanel.setLayout(new GridLayout(4, 1));
        windowGame.add(navPanel);

        navInstruction = new JLabel("You need to get to the borders,"+" which direction do you pick?");
        navInstruction.setFont(font);
        navInstruction.setForeground(Color.yellow);
        navPanel.add(navInstruction);


        choicebtn1 = new JButton("North");

        choicebtn1.setForeground(Color.black);
        choicebtn1.addActionListener(cntrl);
        choicebtn1.setActionCommand("c");
        btnsPanel.add(choicebtn1);

        choicebtn4 = new JButton("East");
        choicebtn4.setForeground(Color.black);
        choicebtn4.addActionListener(cntrl);
        choicebtn4.setActionCommand("c4");
        btnsPanel.add(choicebtn4);

        choicebtn5 = new JButton("West");
        choicebtn5.setForeground(Color.black);
        choicebtn5.addActionListener(cntrl);
        choicebtn5.setActionCommand("c5");
        btnsPanel.add(choicebtn5);

        choicebtn6 = new JButton("South");
        choicebtn6.setForeground(Color.black);
        choicebtn6.addActionListener(cntrl);
        choicebtn6.setActionCommand("c6");
        btnsPanel.add(choicebtn6);



        choicebtn2 = new JButton("Option1: Fight");

        choicebtn2.setForeground(Color.black);
        choicebtn2.addActionListener(cntrl);
        choicebtn2.setActionCommand("");
        btnsPanel.add(choicebtn2);

        choicebtn3 = new JButton("Option2: Run");

        choicebtn3.setForeground(Color.black);
        choicebtn3.addActionListener(cntrl);
        choicebtn3.setActionCommand("");
        btnsPanel.add(choicebtn3);




    }


}
