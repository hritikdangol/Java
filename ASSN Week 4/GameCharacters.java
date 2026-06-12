class GameCharacter {
    String name;

    GameCharacter(String n) {
        this.name = n;
    }

    void attack() {
        System.out.println("Attacked and damaged");
    }
}

class warrior extends GameCharacter {

    warrior(String n) {
        super(n);
    }

    @Override
    void attack() {
        System.out.println(name + " performs a melee attack and deals 40 damage.");
    }
}

class archer extends GameCharacter {
    int arrowcount;

    archer(String n, int ac) {
        super(n);
        this.arrowcount = ac;
    }

    @Override
    void attack() {
        if (arrowcount > 0) {
            arrowcount--;
            System.out.println(name +
                    " shoots an arrow and deals 50 damage. Arrows left: " +
                    arrowcount);
        } else {
            System.out.println(name + " has no arrows left!");
        }
    }
}

class mage extends GameCharacter {
    int mana;

    mage(String n, int ma) {
        super(n);
        this.mana = ma;
    }

    @Override
    void attack() {
        if (mana >= 20) {
            mana -= 20;
            System.out.println(name +
                    " casts a spell and deals 90 damage. Mana left: " +
                    mana);
        } else {
            System.out.println(name + " does not have enough mana!");
        }
    }
}

public class GameCharacters {
    public static void main(String[] args) {

        GameCharacter[] g1 = new GameCharacter[3];

        g1[0] = new warrior("Hritik");
        g1[1] = new archer("Ranil", 50);
        g1[2] = new mage("Kushal", 20);

        for (int i = 0; i < g1.length; i++) {
            g1[i].attack();
        }
    }
}