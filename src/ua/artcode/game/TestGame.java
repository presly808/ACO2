package ua.artcode.game;

import ua.artcode.game.common.GameCharacter;
import ua.artcode.game.weapons.Bow;
import ua.artcode.game.weapons.Sword;

/**
 * Created by admin on 09.11.2014.
 */
public class TestGame {


    public static void main(String[] args) {
        GameCharacter troll = new GameCharacter("Troll", 300);
        GameCharacter human = new GameCharacter("Human", 100);


        Sword sword = new Sword();
        Bow bow = new Bow();

        troll.setWeapon(sword);
        human.setWeapon(bow);

        human.fight(troll);
        human.fight(troll);
        human.fight(troll);


        human.setWeapon(troll.getWeapon()); // change algorithm
        human.fight(troll); //


        human.fight(troll);
        human.fight(troll);



    }
}
