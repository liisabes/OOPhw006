package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements GameInterface, Comparable {

    protected String name;
    protected int hp, maxhp, attack, defense, speed;
    protected int[] damage;
    protected int initiative;

    protected ArrayList<BaseUnit> team;

    protected Coordinate coordinate;

    protected ArrayList <BaseUnit> enemy;

    public BaseUnit(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int x, int y) {
        this.team = team;
        this.damage = damage;
        this.name = name;
        this.hp = hp;
        this.maxhp = maxhp;
        if (new Random().nextBoolean()) {
            this.hp-=9;
        }
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.initiative = initiative;
        this.coordinate = new Coordinate(x, y);
    }

    public void Run() {
        System.out.println(name + " is running");
    }

    public void Walk() {
        System.out.println(name + " is walking");
    }

    public void GetDamage(int doneDamage) {
        doneDamage = (int) (doneDamage * ((100 - this.attack)/100));
        if ((this.hp - doneDamage) > 0) {
            this.hp -= doneDamage;
        }
    }

    public void Attack(BaseUnit target) {
        target.GetDamage(new Random().nextInt(this.damage[0], this.damage[1]));
    }

    public void Defense() {
        System.out.println(name + " is defending");
    }

    public void Healed(int hpPlass) {
        this.hp = hpPlass + this.hp > this.maxhp ? this.maxhp : hpPlass + this.hp;
    }

    @Override
    public int compareTo(Object o) {
        BaseUnit baseUnit = (BaseUnit)o;
        return this.initiative - baseUnit.initiative;
    }

    public int[] getCoords() {
        return new int[]{
            coordinate.x, coordinate.y
        };
    }

    public int getHp() {
        return hp;
    }

    boolean die() {
        if (hp <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public BaseUnit findNearBaseUnit(ArrayList<BaseUnit> team)
    {
        BaseUnit nearUnit = null;
        float minDis = Float.MAX_VALUE;
        for(BaseUnit baseUnit : team) {
            if (baseUnit.die()) {
                continue;
            }
            float dist = baseUnit.coordinate.distance(this.coordinate);
            if(minDis > dist) {
                nearUnit = baseUnit;
                minDis = dist;
            }

        }
        return nearUnit;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy) {
        if (die()) {
            return;
        }
        BaseUnit target = findNearBaseUnit(enemy);
        if (target.coordinate.distance(this.coordinate)< 2) {
            Attack(target);
        } else {
            move(target);
        }
    }

    protected void move (BaseUnit target) {
        int dx = target.coordinate.distanceXY(this.coordinate)[0];
        int dy = target.coordinate.distanceXY(this.coordinate)[1];
        if (Math.abs(dx) > Math.abs(dy)) {
            if (dy > 0) {
                if (isEmptyPosition(this.coordinate.x, this.coordinate.y - 1)) {
                    this.coordinate.y--;
                }
            } else {
                if (isEmptyPosition(this.coordinate.x, this.coordinate.y + 1)) {
                    this.coordinate.y++;
                }
            }
        } else {
            if (dx > 0) {
                if (isEmptyPosition(this.coordinate.x - 1, this.coordinate.y)) {
                    this.coordinate.x--;
                }
            } else {
                if (isEmptyPosition(this.coordinate.x + 1, this.coordinate.y)) {
                    this.coordinate.x++;
                }
            }
        }
    }

    protected boolean isEmptyPosition(int x, int y) {
        for (BaseUnit unit : team) {
            if (unit.coordinate.x == x && unit.coordinate.y == y) {
                if (!unit.die()) {
                    return false;
                }
            }
        }
        return true;
    }
    
}