package enemies;
import combat.ICombatParticipant;

public abstract class Enemy implements ICombatParticipant {
    protected int health;
    protected int attackPower;

    public Enemy(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getHealth() { return health; }
    @Override
    public int getAttackPower() { return attackPower; }
}