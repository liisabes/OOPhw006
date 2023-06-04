package Units;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<BaseUnit> team1);
    String getInfo();
}
