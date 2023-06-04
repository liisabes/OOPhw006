package Units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Magician extends Magicians {

    public Magician(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(4, team, new int[] { 1, 3 }, name, 3, 10, 10, 1, 1, 10, 1, 1, x, y);
    }

    public String getInfo() {
        return "\nВолшебник";
    }

    @Override
    public void step(ArrayList<BaseUnit> team1) {
        if (healingPower < 1) {
            System.out.println("Отсутствует сила для лечения!");
            return;
        }
        int indDamaged = 0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i + 1; j < team.size() - 1; j++) {
                if (team.get(i).hp != 0 || team.get(j).hp != 0) {
                    if (team.get(i).hp / team.get(i).maxhp < team.get(j).hp / team.get(j).maxhp) {
                        indDamaged = i;
                    }
                }
            }
        }
        team.get(indDamaged).Healed(new Random().nextInt(this.damage[0], this.damage[1]));
        this.healingPower -= 1;

    }

    @Override
    public String toString() {
        return "Имя: " + name +
                // "; Damage: " + Arrays.toString(damage) +
                "; Здоровье: " + hp +
                // "; Максимальное здоровье: " + maxhp +
                // "; Кол-во атак: " + attack +
                // "; Кол-во защит: " + defense +
                "; Скорость: " + speed +
                // "; Сила здоровья: " + healingPower +
                // "; Сила защиты: " + protectionPower +
                "; Сила магии: " + magicPower;
                // "; Initiative: " + initiative;


    }

}
