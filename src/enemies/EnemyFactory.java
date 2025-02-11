package enemies;
import java.util.Random;

public class EnemyFactory {
    public static Enemy createRandomEnemy() {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0: return new Ninja();
            case 1: return new Mage();
            case 2: return new Zombie();
            default: return new Ninja();
        }
    }
}

