package pro.sky.webstore.skyprowebstore.service;

import java.util.List;

public interface CartService {
    void addItem(List<Integer> items);
    String getItems();


}