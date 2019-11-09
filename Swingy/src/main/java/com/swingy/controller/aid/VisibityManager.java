package com.swingy.controller.aid;

import com.swingy.view.GameGui;
import com.swingy.view.Gui;

public class VisibityManager {

    Gui guiframe = new Gui();
    GameGui gameGui = new GameGui();

    public VisibityManager(Gui ui, GameGui ui1) {

        guiframe = ui;
        gameGui = ui1;
    }

    public void startTheGame(){

        gameGui.windowGame.setVisible(true);
        gameGui.gameInstruction.setVisible(false);
        gameGui.gameInstLable.setVisible(false);
        gameGui.choicebtn2.setVisible(false);
        gameGui.choicebtn3.setVisible(false);

        gameGui.navInstruction.setVisible(true);
        gameGui.choicebtn4.setVisible(true);
        gameGui.choicebtn1.setVisible(true);
        gameGui.choicebtn5.setVisible(true);
        gameGui.choicebtn6.setVisible(true);

    }

    public void encounterVillain(){

        gameGui.windowGame.setVisible(true);
        gameGui.gameInstruction.setVisible(true);
        gameGui.gameInstLable.setVisible(true);
        gameGui.choicebtn2.setVisible(true);
        gameGui.choicebtn3.setVisible(true);

        gameGui.choicebtn4.setVisible(false);
        gameGui.choicebtn1.setVisible(false);
        gameGui.choicebtn5.setVisible(false);
        gameGui.choicebtn6.setVisible(false);
    }

    public void showTittleScreen() {

            guiframe.titlePanel.setVisible(true);
            guiframe.startButton.setVisible(true);

            guiframe.instructiontext.setVisible(false);
            guiframe.choicePanel.setVisible(false);
            guiframe.artifactPanel.setVisible(false);
            guiframe.createHeroPanel.setVisible(false);
            guiframe.createHeroLable.setVisible(false);
            guiframe.heroNameText.setVisible(false);
            guiframe.heroClassRadio.setVisible(false);
            guiframe.submit.setVisible(false);
            guiframe.errorMsgLable.setVisible(false);
            guiframe.errorMsg.setVisible(false);
            guiframe.heroStatsLable.setVisible(false);
            guiframe.heroStatsPanel.setVisible(false);
            guiframe.playGame.setVisible(false);
            guiframe.btnPanel.setVisible(false);
            guiframe.errLable.setVisible(false);
            guiframe.errPanel.setVisible(false);

    }
    public void showSelectionScreen(){

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.createHeroPanel.setVisible(false);
        guiframe.createHeroLable.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.heroClassRadio.setVisible(false);
        guiframe.submit.setVisible(false);
        guiframe.errorMsgLable.setVisible(false);
        guiframe.errorMsg.setVisible(false);
        guiframe.heroStatsLable.setVisible(false);
        guiframe.heroStatsPanel.setVisible(false);
        guiframe.playGame.setVisible(false);
       guiframe.btnPanel.setVisible(false);
        guiframe.errLable.setVisible(false);
        guiframe.errPanel.setVisible(false);

        guiframe.instructiontext.setVisible(true);
        guiframe.choicePanel.setVisible(true);
        guiframe.artifactPanel.setVisible(false);

    }

    public void showCreateHeroScreen(){

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.instructiontext.setVisible(false);
        guiframe.choicePanel.setVisible(false);
        guiframe.artifactPanel.setVisible(false);
        guiframe.heroStatsLable.setVisible(false);
        guiframe.heroStatsPanel.setVisible(false);
       // guiframe.playGame.setVisible(false);
        //guiframe.btnPanel.setVisible(false);
        guiframe.errLable.setVisible(false);
        guiframe.errPanel.setVisible(false);

        guiframe.createHeroPanel.setVisible(true);
        guiframe.createHeroLable.setVisible(true);
        guiframe.heroNameText.setVisible(true);
        guiframe.heroClassRadio.setVisible(true);
        guiframe.submit.setVisible(true);

    }

    public void showErrorMsg(){

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.instructiontext.setVisible(false);
        guiframe.choicePanel.setVisible(false);
        guiframe.artifactPanel.setVisible(false);
        guiframe.heroStatsLable.setVisible(false);
        guiframe.heroStatsPanel.setVisible(false);
        guiframe.playGame.setVisible(false);
        guiframe.btnPanel.setVisible(false);
        guiframe.errLable.setVisible(false);
        guiframe.errPanel.setVisible(false);

        guiframe.createHeroPanel.setVisible(true);
        guiframe.createHeroLable.setVisible(true);
        guiframe.heroNameText.setVisible(true);
        guiframe.heroClassRadio.setVisible(true);
        guiframe.errorMsg.setVisible(true);
        guiframe.errorMsgLable.setVisible(true);
        guiframe.submit.setVisible(true);


    }

    public  void showHeroStats(){

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.instructiontext.setVisible(false);
        guiframe.choicePanel.setVisible(false);
        guiframe.artifactPanel.setVisible(true);
        guiframe.createHeroPanel.setVisible(false);
        guiframe.createHeroLable.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.heroClassRadio.setVisible(false);
        guiframe.errorMsg.setVisible(false);
        guiframe.errorMsgLable.setVisible(false);
        guiframe.submit.setVisible(false);
        guiframe.errLable.setVisible(false);
        guiframe.errPanel.setVisible(false);

        guiframe.heroStatsLable.setVisible(true);
        guiframe.heroStatsPanel.setVisible(true);
       guiframe.playGame.setVisible(true);
        guiframe.btnPanel.setVisible(true);
        //gameGui.playGame.setVisible(true);


    }
    public  void startPlayGame(){

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.instructiontext.setVisible(false);
        guiframe.choicePanel.setVisible(false);
        guiframe.artifactPanel.setVisible(true);
        guiframe.createHeroPanel.setVisible(false);
        guiframe.createHeroLable.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.heroClassRadio.setVisible(false);
        guiframe.errorMsg.setVisible(false);
        guiframe.errorMsgLable.setVisible(false);
        guiframe.submit.setVisible(false);
        guiframe.errLable.setVisible(false);
        guiframe.errPanel.setVisible(false);

        guiframe.heroStatsLable.setVisible(true);
        guiframe.playGame.setVisible(true);
        guiframe.heroStatsPanel.setVisible(true);
        guiframe.btnPanel.setVisible(true);

    }
    public void showSelectHeroScreen(){

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.instructiontext.setVisible(false);
        guiframe.choicePanel.setVisible(false);
        guiframe.artifactPanel.setVisible(true);
        guiframe.createHeroPanel.setVisible(false);
        guiframe.createHeroLable.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.heroClassRadio.setVisible(false);
        guiframe.errorMsg.setVisible(false);
        guiframe.errorMsgLable.setVisible(false);
        guiframe.submit.setVisible(false);
        guiframe.errLable.setVisible(false);
        guiframe.errPanel.setVisible(false);

        guiframe.heroStatsLable.setVisible(true);
        guiframe.playGame.setVisible(true);
        guiframe.heroStatsPanel.setVisible(false);
        guiframe.btnPanel.setVisible(true);
        guiframe.selectHeroLable.setVisible(true);
        guiframe.selectHeroPanel.setVisible(true);


    }
    public  void popErrMsg() {

        guiframe.titlePanel.setVisible(false);
        guiframe.startButton.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.instructiontext.setVisible(true);
        guiframe.choicePanel.setVisible(true);
        guiframe.artifactPanel.setVisible(false);
        guiframe.createHeroPanel.setVisible(false);
        guiframe.createHeroLable.setVisible(false);
        guiframe.heroNameText.setVisible(false);
        guiframe.heroClassRadio.setVisible(false);
        guiframe.errorMsg.setVisible(false);
        guiframe.errorMsgLable.setVisible(false);
        guiframe.submit.setVisible(false);
        guiframe.errLable.setVisible(true);
        guiframe.errPanel.setVisible(true);

        guiframe.heroStatsLable.setVisible(false);
       // guiframe.playGame.setVisible(false);
        guiframe.heroStatsPanel.setVisible(false);
       // guiframe.btnPanel.setVisible(false);
        guiframe.selectHeroLable.setVisible(false);
        guiframe.selectHeroPanel.setVisible(false);

    }
}
