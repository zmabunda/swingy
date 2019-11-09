package com.swingy.model.player;

//import com.swingy.ReadFile;
import com.swingy.view.Gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class Hero  extends SuperClassHero{

    public Hero(){

        Gui sb = new Gui();
        name = input(sb.heroNameText.getText()); ;
    }

    public String input(String sb) {

        File f = new File("file.txt");
        if (f.exists()) {

            try (BufferedReader br = Files.newBufferedReader(Paths.get("file.txt"))) {

                String line;
                while ((line = br.readLine()) != null) {
                    sb = sb + line;
                }

            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
        return sb;
    }
}
