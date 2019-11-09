package com.swingy.model;

import com.swingy.controller.aid.AppSwingy;
import com.swingy.controller.aid.VisibityManager;
import com.swingy.model.artifact.Defense;
import com.swingy.model.artifact.Weapons;
import com.swingy.model.player.Character;
import com.swingy.model.player.Hero;
import com.swingy.model.player.HeroClass;
import com.swingy.view.Gui;

public class Story {

    Character character = new Character();

    AppSwingy appSwingy;
    Gui guiframe;
    VisibityManager vm;

    public Story(AppSwingy game, Gui uInterface, VisibityManager vManager){

        appSwingy = game;
        guiframe = uInterface;
        vm = vManager;

    }

    public void DefaultSetup(){


        character.attack = new Weapons();
        guiframe.weapon.setText("weapon: "+character.attack.name+ "|");
        character.hp = 10;
        guiframe.hitPont.setText("hp: "+ character.hp + "|");
        character.level = 0;
        guiframe.level.setText("level: "+character.level+ "|");
        character.exp = 0;
        guiframe.exp.setText("exp: "+ character.exp+ "|");
        character.heroClass = new HeroClass();
        guiframe.heroClass1.setText("HeroClass: "+character.heroClass.classname+ "|");
        character.name = new Hero();
        guiframe.name.setText("HeroName: "+character.name.name+ "|");
        character.defense = new Defense();
        guiframe.defense1.setText("Defense: "+character.defense.name+ "|");




    }
}
