package com.swingy;

import com.swingy.view.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Storage extends Gui {

    public void dataBase(String name) throws IOException {

       File outFile = new File("file.txt");

        FileOutputStream outFileStream = new FileOutputStream(outFile);
        PrintWriter outStream = new PrintWriter(outFileStream);
        outStream.println(name);
        outStream.close();

    }


}
