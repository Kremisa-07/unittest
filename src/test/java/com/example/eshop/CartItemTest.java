package com.example.eshop;

import com.example.eshop.cart.CartItem;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CartItemTest {

    @Test
    void createCartItem() {
        Product product = new Product("Test Product", "This is a test product", new BigDecimal("19.99")) {};
        int quantity = 10;

        CartItem cartItem = new CartItem(product, quantity);
        assert cartItem.getProduct().equals(product);
        assert cartItem.getQuantity() == quantity;
    }

    @Test
    void updateCartItemQuantity() {
        Product product = new Product("Test Product", "This is a test product", new BigDecimal("19.99")) {};
        CartItem cartItem = new CartItem(product, 10);

        cartItem.setQuantity(5);
        assert cartItem.getQuantity() == 5;
    }
}
