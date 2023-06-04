package Units;
import java.util.ArrayList;
import java.util.Arrays;

public class Crossbowman extends Crossbowmen {

    public Crossbowman(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(1, team, new int[] {1, 3}, name, 1, 10, 10, 1, 1, 1, 1, 1, x, y);
    }

    public String getInfo() {
        return "\nАрбалетчик";
    }

    // @Override
    // public void step(ArrayList<BaseUnit> team1) {
        
    // }

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
        "; Стрелы: " + arrow;
        // "; Кол-во арбалетов: " + crossbow +
        // "; Кол-во наконечников " + tip;
        // "; Initiative: " + initiative;
        

    }
}
