package Units;
import java.util.ArrayList;

public abstract class Snipers extends BaseUnit implements GameInterface {

    protected int rifle, accurateShot;

    public Snipers(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int rifle, int accurateShot, int x, int y) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed, x, y);
        this.rifle = rifle;
        this.accurateShot = accurateShot;
    }

    public void Shoot() {
        System.out.println(name + " is shooting");
    }

    public void Aim() {
        System.out.println(name + " is aiming");
    }

    public void Hide() {
        System.out.println(name + " is hiding");
    }
    
}
