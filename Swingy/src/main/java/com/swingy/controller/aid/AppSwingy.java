package com.swingy.controller.aid;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;

import com.swingy.Storage;
import com.swingy.controller.aid.VisibityManager;
import com.swingy.model.Story;
import com.swingy.model.player.Hero;
import com.swingy.view.GameGui;
import com.swingy.view.Gui;

import javax.swing.*;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.util.Formatter;
import com.swingy.controller.*;

public class AppSwingy extends  Gui {

    Gui guiframe = new Gui();
    MainFrame frame = new MainFrame();
    GameGui gameGui = new GameGui();
    VisibityManager vm = new VisibityManager(guiframe, gameGui);
    GuiChoice cntrl = new GuiChoice();
    Storage obj = new Storage();
    Hero ob = new Hero();

    Story gStory = new Story(this, guiframe, vm);


    public AppSwingy() {
        gameGui.theGui(cntrl);
        guiframe.theGui(cntrl);

        gStory.DefaultSetup();
        vm.showTittleScreen();
    }

    public class GuiChoice implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String choicebtn = event.getActionCommand();

            switch (choicebtn) {

                case "start":
                    vm.showSelectionScreen();
                    break;

                case "c1":
                    vm.showCreateHeroScreen();
                    break;

                case "c2":

                    File newFile = new File("file.txt");

                    if (newFile.length() == 0) {
                        vm.popErrMsg();
                        System.out.println("File is empty ...");
                    } else {
                        //vm.showSelectHeroScreen();
                        vm.showHeroStats();
                        System.out.println("File is not empty ...");
                    }

                    break;

                case "c":
                    break;

                case "c4":
                    vm.encounterVillain();
                    break;

                case "c5":
                    break;

                case "c6":
                    vm.encounterVillain();
                    break;

                case "play":
                    try {
                        obj.dataBase(guiframe.heroNameText.getText());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ob.input(guiframe.heroNameText.getText());
                    if(!guiframe.heroClassRadio.isSelected()){
                        vm.showErrorMsg();
                    }
                    else
                        vm.showHeroStats();
                    break;
                case "rBtn":
                    break;

                case "Go":
                    frame.heroExec();
                    //vm.startTheGame();


                default:
                    System.out.println("make a choice");

            }
            }

        }

    }

