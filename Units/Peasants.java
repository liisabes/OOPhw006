package Units;
import java.util.ArrayList;

public abstract class Peasants extends BaseUnit implements GameInterface {

    protected int crop, house, animal;

    public Peasants(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int crop, int house, int animal, int x, int y) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed, x, y);
        this.crop = crop;
        this.house = house;
        this.animal = animal;
    }

    public void Harvest() {
        System.out.println(name + "is harvesting");
    }

    public void Plant() {
        System.out.println(name + "is sowing planting");
    }

    public void FeedAnimal() {
        System.out.println(name + "is sowing  feeding the animal");
    }

}
