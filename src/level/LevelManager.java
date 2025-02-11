package level;
import enemies.*;

public class LevelManager {
    public Enemy spawnEnemy() {
        return new Ninja();
    }
}
