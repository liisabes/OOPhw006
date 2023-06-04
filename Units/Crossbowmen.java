package Units;

import java.util.ArrayList;

public abstract class Crossbowmen extends BaseUnit implements GameInterface {

    protected int arrow, crossbow, tip;

    public Crossbowmen(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int arrow, int crossbow, int tip, int x, int y) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed, x, y);
        this.arrow = arrow;
        this.crossbow = crossbow;
        this.tip = tip;
    }
    
    public void Hit() {
        System.out.println(name + " is hitting");
    }

    @Override
    public void step(ArrayList<BaseUnit> team1) {
        if (hp <= 0 || arrow <= 0) {
            return;
        }
        float minDistanse = Float.MAX_VALUE;
        BaseUnit target = null;
        for (BaseUnit u : team1) {
            float tmp = u.coordinate.distance(this.coordinate);
            if (tmp < minDistanse) {
                minDistanse = tmp;
                target = u;
            }
        }
        System.out.println(name + " стреляет в " + target.name);

    }

}
