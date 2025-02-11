package player;
import items.Item;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Item> inventory = new ArrayList<>();

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void useItem(int index) {
        if (index >= 0 && index < inventory.size()) {
            inventory.get(index).use();
        }
    }

    public List<Item> getInventory() { return inventory; }
}