package ua.artcode.game.common;

import ua.artcode.game.weapons.IWeapon;

/**
 * Created by admin on 09.11.2014.
 */
public class GameCharacter {

    private String name;
    private int health;
    private IWeapon weapon;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void receiveDamage(int damage){
        if(health <= 0){
            System.out.println(this + " already dead");
            return;
        }
        this.health -= damage;
    }

    public void fight(GameCharacter enemy){
        System.out.println(this + " attacks " + enemy);
        enemy.receiveDamage(weapon.use());
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }


}
