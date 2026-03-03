package com.example.eshop.cart;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class CartItemKresadloTest {
    Product product = new Product("Test Product", "This is a test product", new BigDecimal("19.99")) {};

    @Test
    void addedNewItem() {
        int quantity = 10;

        Cart cart = new Cart();
        cart.addItem(product, quantity);
        CartItem cartItem = cart.getItems().getLast();

        assert cart.getItems().getLast().equals(cartItem);
    }
}
