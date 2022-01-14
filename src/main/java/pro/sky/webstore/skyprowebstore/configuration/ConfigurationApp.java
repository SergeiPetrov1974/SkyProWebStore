package pro.sky.webstore.skyprowebstore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.webstore.skyprowebstore.data.Cart;


@Configuration
public class ConfigurationApp {
    @Bean
    @SessionScope
    public Cart createCart() {
        return new Cart();
    }
}