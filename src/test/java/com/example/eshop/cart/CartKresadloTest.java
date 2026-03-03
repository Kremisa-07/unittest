package com.example.eshop.cart;

import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CartKresadloTest {

    Product product = new Product("Test Product", "This is a test product", new BigDecimal("19.99")) {};

    @Test
    void createCartItem() {
        int quantity = 10;

        // testuje jestli se pridal CartItem
        CartItem cartItem = new CartItem(product, quantity);
        assert cartItem.getProduct().equals(product);
        assert cartItem.getQuantity() == quantity;
    }

}
