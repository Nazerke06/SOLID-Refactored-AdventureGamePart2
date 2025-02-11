package items;

public class GoldCoin implements Item {
    @Override
    public void use() {
        System.out.println("You collected gold!");
    }
}