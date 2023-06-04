package Units;
import java.util.ArrayList;
import java.util.Arrays;

public class Monk extends Monks{

    public Monk(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(5, team, new int[] {1, 3}, name, 10, 100, 10, 1, 1, 1, x, y);
    }

    public String getInfo() {
        return "\nМонах";
    }

    @Override
    public void step(ArrayList<BaseUnit> team1) {
        

    }

    @Override
    public String toString() {
        return 
        "Имя: " + name + 
        // "; Damage: " + Arrays.toString(damage) +
        "; Здоровье: " + hp + 
        // "; Максимальное здоровье: " + maxhp + 
        // "; Кол-во атак: " + attack + 
        // "; Кол-во защит: " + defense + 
        "; Скорость: " + speed + 
        "; Сила помощи: " + countsharePower;
        // "; Initiative: " + initiative;

    }

}
