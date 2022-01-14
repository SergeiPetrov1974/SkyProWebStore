package pro.sky.webstore.skyprowebstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.webstore.skyprowebstore.service.CartService;

import java.util.List;

@RestController
public class CartController {
    private final CartService cartService;


    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam List<Integer> items) {
        cartService.addItem(items);
        return "В корзину добавлен предмет: " + items;
    }

    @GetMapping("get")
    public String getItem() {
        return cartService.getItems();

    }
}