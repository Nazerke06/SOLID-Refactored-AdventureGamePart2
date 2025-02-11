package items;
import player.Player;

public class HealthElixir implements Item {
    @Override
    public void use() {
        System.out.println("Health restored!");
    }
}