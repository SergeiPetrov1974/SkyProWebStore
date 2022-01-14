package pro.sky.webstore.skyprowebstore.data;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> items;

    public Cart() {
        this.items = new ArrayList<Integer>();
    }

    public List<Integer> getItems() {
        return items;
    }

    public void addItems(Integer item) {
        items.add(item);
    }

    public String toString() {
        return "В корзине находятся предметы: " + items;
    }
}