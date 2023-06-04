package Units;

import java.util.ArrayList;

public abstract class Monks extends BaseUnit implements GameInterface {

    protected int countsharePower;
    
    public Monks(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int countsharePower, int x, int y) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed, x, y);
        this.countsharePower = countsharePower;
    }
    
    public void SharePower() {
        System.out.println(name + " is sharing the power now");
    }
}
