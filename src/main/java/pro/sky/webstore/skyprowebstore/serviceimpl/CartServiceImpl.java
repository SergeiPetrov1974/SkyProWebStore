package pro.sky.webstore.skyprowebstore.serviceimpl;

import org.springframework.stereotype.Service;
import pro.sky.webstore.skyprowebstore.data.Cart;
import pro.sky.webstore.skyprowebstore.service.CartService;

import java.util.List;


@Service

public class CartServiceImpl implements CartService {
    private final Cart cart;


    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItem(List<Integer> items) {
        for (Integer item : items) {
            cart.addItems(item);
        }
    }

    @Override
    public String getItems() {
        return cart.toString();
    }
}
