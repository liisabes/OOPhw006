import java.util.ArrayList;
import java.util.Comparator;

import Units.BaseUnit;
import Units.Coordinate;
import Units.Crossbowman;
import Units.Magician;
import Units.Monk;
import Units.Names;
import Units.Outlaw;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<BaseUnit> lArrayList1 = new ArrayList<>();
    public static ArrayList<BaseUnit> lArrayList2 = new ArrayList<>();
    public static ArrayList<BaseUnit> team3 = new ArrayList<>();


    public static void main(String[] args) {
        
        int randomValue = 8;
        int countOfHerous = 5;
        int x1 = 1;
        for (int i = 1; i < countOfHerous + 1; i++) {
            switch (new Random().nextInt(randomValue)) {
                case 0:
                    lArrayList1.add(new Crossbowman(lArrayList1, getName(), x1, i));
                    break;
                case 1:
                    lArrayList1.add(new Magician(lArrayList1, getName(), x1, i));
                    break;
                case 2:
                    lArrayList1.add(new Monk(lArrayList1, getName(), x1, i));
                    break;
                case 4:
                    lArrayList1.add(new Peasant(lArrayList1, getName(), x1, i));
                    break;
                case 5:
                    lArrayList1.add(new Sniper(lArrayList1, getName(), x1, i));
                    break;
                case 6:
                    lArrayList1.add(new Spearman(lArrayList1, getName(), x1, i));
                    break;
                case 7:
                    lArrayList1.add(new Outlaw(lArrayList1, getName(), x1, i));
                    break;
            }
        }

        int x2 = 10;
        for (int i = 1; i < countOfHerous + 1; i++) {
            switch (new Random().nextInt(randomValue)) {
                case 0:
                    lArrayList2.add(new Crossbowman(lArrayList2, getName(), x2, i));
                    break;
                case 1:
                    lArrayList2.add(new Magician(lArrayList2, getName(), x2, i));
                    break;
                case 2:
                    lArrayList2.add(new Monk(lArrayList2, getName(), x2, i));
                    break;
                case 4:
                    lArrayList2.add(new Peasant(lArrayList2, getName(), x2, i));
                    break;
                case 5:
                    lArrayList2.add(new Sniper(lArrayList2, getName(), x2, i));
                    break;
                case 6:
                    lArrayList2.add(new Spearman(lArrayList2, getName(), x2, i));
                    break;
                case 7:
                    lArrayList1.add(new Outlaw(lArrayList2, getName(), x2, i));
                    break;
            }
        }

        

        team3.addAll(lArrayList1);
        team3.addAll(lArrayList2);
        team3.sort(BaseUnit::compareTo);

        Scanner in = new Scanner(System.in);
        while (true) {
            View.view();
            in.nextLine();
            for (BaseUnit baseUnit: team3) {
                if (lArrayList1.contains(baseUnit)) {
                    baseUnit.step(lArrayList2);
                }
                else {
                    baseUnit.step(lArrayList1);
                }
            }
        }
        
    }
    
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
