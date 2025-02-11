package player;
import combat.ICombatParticipant;

public class Player implements ICombatParticipant {
    private int health;
    private int experience;
    private InventoryManager inventory;

    public Player() {
        this.health = 100;
        this.experience = 0;
        this.inventory = new InventoryManager();
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("You died!");
        }
    }

    @Override
    public int getHealth() { return health; }
    @Override
    public int getAttackPower() { return 10; }

    public void gainExperience(int exp) {
        experience += exp;
    }

    public InventoryManager getInventory() { return inventory; }
}