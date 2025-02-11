package combat;

public interface ICombatParticipant {
    int getHealth();
    void takeDamage(int damage);
    int getAttackPower();
}
