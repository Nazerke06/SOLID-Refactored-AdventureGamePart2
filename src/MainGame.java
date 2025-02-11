import player.Player;
import combat.CombatManager;
import enemies.Enemy;
import enemies.EnemyFactory;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player();
        CombatManager combatManager = new CombatManager();

        Enemy enemy = EnemyFactory.createRandomEnemy();
        combatManager.engageCombat(player, enemy);
    }
}