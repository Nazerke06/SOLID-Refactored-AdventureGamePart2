package combat;

public class CombatManager {
    public void engageCombat(ICombatParticipant player, ICombatParticipant enemy) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            enemy.takeDamage(player.getAttackPower());
            if (enemy.getHealth() > 0) {
                player.takeDamage(enemy.getAttackPower());
            }
        }
    }
}