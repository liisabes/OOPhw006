package Units;

import java.util.ArrayList;

public abstract class Outlaws extends BaseUnit implements GameInterface {

    protected int cartridge, gold;

    public Outlaws(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int cartridge, int gold, int x, int y) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed, x, y);
        this.cartridge = cartridge;
        this.gold = gold;
    }

    public void Rob() {
        System.out.println(name + " is robbing");
    }

    public void Steal() {
        System.out.println(name + " is stealing");
    }

    public void Vandalize() {
        System.out.println(name + " is vandalizing");
    }
}
