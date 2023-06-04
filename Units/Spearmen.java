package Units;

import java.util.ArrayList;

public abstract class Spearmen extends BaseUnit implements GameInterface {

    protected int spear;

    public Spearmen(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int spear, int x, int y) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed, x, y);
        this.spear = spear;
    }

    public void Help() {
        System.out.println(name + " is helping");
    }

    public void Kill() {
        System.out.println(name + " is killing");
    }

    public void Die() {
        System.out.println(name + " is dieing");
    }
    
}
