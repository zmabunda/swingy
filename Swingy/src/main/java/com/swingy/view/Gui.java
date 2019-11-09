package com.swingy.view;

import com.swingy.controller.aid.AppSwingy;
import com.swingy.model.player.HeroClass;


import javax.swing.*;
import java.awt.*;

public class Gui implements  InterfaceGui{

    JFrame window;
    public JPanel titlePanel;
    public JPanel startButton;
    public JLabel titleLabel, createHeroLable, selectHeroLable, errorMsgLable,errorMsgLable1, heroStatsLable;
    JButton pressStart;
    Font titleFont = new Font("Times new Roman", Font.ITALIC, 45);
    Font normalFont = new Font("Times new Roman", Font.PLAIN, 25);
    public JPanel instructiontext;
    public JPanel btnPanel;
    public JLabel errLable;
    public JPanel choicePanel, createHeroPanel, selectHeroPanel, errorMsg, heroStatsPanel ;
    public JPanel artifactPanel, errorMsgPalnel1;
    public JLabel hitPont;
    public JLabel weapon;
    public JLabel level;
    public JLabel exp;
    public JLabel heroClass1;
    public JLabel name;
    public JLabel defense1;
    public JPanel errPanel;
    JButton choice1, choice2, choice3, choice4;
    JTextArea textArea;
    public JTextField  heroNameText = new JTextField();
    public JRadioButton heroClassRadio;
    public JButton submit, playGame;

    public void theGui(AppSwingy.GuiChoice cntrl) {

        HeroClass rBtn = new HeroClass();
        //Window

        window = new JFrame();

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);


        //TitlePanel

        titlePanel = new JPanel();

        titlePanel.setBounds(100, 100, 500, 100);
        titlePanel.setBackground(Color.black);

        //TitleLable

        titleLabel = new JLabel("Welcome to Swingy");

        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);


        //startButton

        startButton = new JPanel();

        startButton.setBounds(200, 400, 300, 100);
        startButton.setBackground(Color.black);

        //pressStart button

        pressStart = new JButton("START");
        pressStart.setForeground(Color.BLACK);
        pressStart.setFont(normalFont);
        pressStart.setFocusPainted(false);
        startButton.add(pressStart);
        pressStart.addActionListener(cntrl);
        pressStart.setActionCommand("start");

        ///////////////////////////////
        window.add(titlePanel);
        window.add(startButton);
        window.setVisible(true);


        //create hero window.

        instructiontext = new JPanel();

        instructiontext.setBounds(200, 200, 700, 70);
        instructiontext.setBackground(Color.black);
        window.add(instructiontext);

        textArea = new JTextArea("[Create or Select a hero !!]");

        textArea.setBounds(100, 100, 600, 250);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.black);
        textArea.setFont(normalFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        instructiontext.add(textArea);

        //choice button panel

        choicePanel = new JPanel();

        choicePanel.setBounds(250, 350, 300, 140);
        choicePanel.setBackground(Color.black);
        choicePanel.setLayout(new GridLayout(4, 1));
        window.add(choicePanel);

        ///////////////////

        choice1 = new JButton("create hero");

        choice1.setBackground(Color.black);
        choice1.setForeground(Color.black);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choicePanel.add(choice1);
        choice1.addActionListener(cntrl);
        choice1.setActionCommand("c1");

        choice2 = new JButton("Select Hero");

        choice2.setBackground(Color.black);
        choice2.setForeground(Color.black);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choicePanel.add(choice2);
        choice2.addActionListener(cntrl);
        choice2.setActionCommand("c2");

        choice3 = new JButton("Switch to console");

        choice3.setBackground(Color.black);
        choice3.setForeground(Color.BLACK);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choicePanel.add(choice3);
        choice3.addActionListener(cntrl);
        choice3.setActionCommand("c3");

        choice4 = new JButton("Quit Game");

        choice4.setBackground(Color.black);
        choice4.setForeground(Color.black);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choicePanel.add(choice4);
        choice4.addActionListener(cntrl);
        choice4.setActionCommand("c4");

        //////////////////////////////////////////////

        artifactPanel = new JPanel();

        artifactPanel.setBounds(100, 15, 700, 150);
        artifactPanel.setBackground(Color.black);
        artifactPanel.setLayout(new GridLayout(4, 4));
        window.add(artifactPanel);

        hitPont = new JLabel("hitPoints");

        hitPont.setFont(normalFont);
        hitPont.setForeground(Color.white);
        artifactPanel.add(hitPont);


        weapon = new JLabel("Weapon");

        weapon.setFont(normalFont);
        weapon.setForeground(Color.white);
        artifactPanel.add(weapon);

        level = new JLabel("level");

        level.setFont(normalFont);
        level.setForeground(Color.white);
        artifactPanel.add(level);

        exp = new JLabel("exp");

        exp.setFont(normalFont);
        exp.setForeground(Color.white);
        artifactPanel.add(exp);


        heroClass1 = new JLabel("HeroClass");

        heroClass1.setFont(normalFont);
        heroClass1.setForeground(Color.white);
        artifactPanel.add(heroClass1);


        name = new JLabel("name");

        name.setFont(normalFont);
        name.setForeground(Color.white);
        artifactPanel.add(name);


        defense1 = new JLabel("defense");

        defense1.setFont(normalFont);
        defense1.setForeground(Color.white);
        artifactPanel.add(defense1);
        ///////////////////////////////////////////////////////

        createHeroPanel = new JPanel();

        createHeroPanel.setBounds(150, 100, 350, 200);
        createHeroPanel.setBackground(Color.black);
        createHeroPanel.setLayout(new GridLayout(4, 1));
        window.add(createHeroPanel);


        createHeroLable = new JLabel("Create a hero(input hero name)");

        createHeroLable.setFont(normalFont);
        createHeroLable.setForeground(Color.white);
        createHeroPanel.add(createHeroLable);

        
        heroNameText.setFont(normalFont);
        createHeroPanel.add(heroNameText);

        heroClassRadio = new JRadioButton("Class Name: "+ rBtn.classname);

        heroClassRadio.setFont(normalFont);
        heroClassRadio.setForeground(Color.white);
        heroClassRadio.addActionListener(cntrl);
        heroClassRadio.setActionCommand("rBtn");
        createHeroPanel.add(heroClassRadio);

        submit = new JButton("Submit ");
        submit.setSize(50,50);
        submit.setFont(normalFont);
        submit.setForeground(Color.black);
        submit.addActionListener(cntrl);
        submit.setActionCommand("play");
        createHeroPanel.add(submit);

        //////////////////////////////////////////////

        errorMsg = new JPanel();

        errorMsg.setBounds(90, 15, 350, 200);
        errorMsg.setBackground(Color.black);
        errorMsg.setLayout(new GridLayout(4, 1));
        window.add(errorMsg);

        errorMsgLable = new JLabel("please select a hero type!!");

        errorMsgLable.setFont(normalFont);
        errorMsgLable.setForeground(Color.red);
        errorMsg.add(errorMsgLable);


        selectHeroPanel = new JPanel();

        selectHeroPanel.setBounds(90, 15, 350, 200);
        selectHeroPanel.setBackground(Color.black);
        selectHeroPanel.setLayout(new GridLayout(4, 1));
        window.add(selectHeroPanel);

        selectHeroLable = new JLabel(heroNameText.getText());

        selectHeroLable.setFont(normalFont);
        selectHeroLable.setForeground(Color.red);
        selectHeroPanel.add(selectHeroLable);

        heroStatsPanel = new JPanel();

        heroStatsPanel.setBounds(10, 250, 800, 100);
        heroStatsPanel.setBackground(Color.black);
        //heroStatsPanel.setLayout(new GridLayout(1, 1));
        window.add(heroStatsPanel);

        heroStatsLable = new JLabel("You've now created your hero follow the given instructions to play..");

        heroStatsLable.setFont(normalFont);
        heroStatsLable.setForeground(Color.yellow);
        heroStatsLable.setLayout(new GridLayout(4, 2));
        heroStatsPanel.add(heroStatsLable);


        //lableBtn = new JLabel();
        btnPanel = new JPanel();
        btnPanel.setBounds(200, 400, 300, 100);
        btnPanel.setBackground(Color.black);
        window.add(btnPanel);

        playGame = new JButton("Play");
        playGame.setFont(normalFont);
        //playGame.setBounds(10, 450, 800, 300);
        playGame.setForeground(Color.black);
        playGame.addActionListener(cntrl);
        playGame.setActionCommand("Go");
        btnPanel.add(playGame);


       errPanel = new JPanel();

        errPanel.setBounds(90, 35, 350, 200);
        errPanel.setBackground(Color.black);
        errPanel.setLayout(new GridLayout(4, 1));
        window.add(errPanel);

        errLable = new JLabel("You have to create a hero first!!");

        errLable.setFont(normalFont);
        errLable.setForeground(Color.red);
        errPanel.add(errLable);

    }
}
