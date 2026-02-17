package com.example.eshop;

import com.example.eshop.cart.Cart;
import com.example.eshop.cart.CartItem;
import com.example.eshop.order.Order;
import com.example.eshop.order.OrderStatus;
import com.example.eshop.product.DigitalProduct;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderTest {
    @Test
    void createOrder() {

        List<CartItem> items = List.of(new CartItem[]{
                new CartItem(new DigitalProduct("Product 1", "Description 1", new BigDecimal("10.00"), "https://example.com/download/product1"), 1),
                new CartItem(new DigitalProduct("Product 2", "Description 2", new BigDecimal("20.00"), "https://example.com/download/product2"), 2)
        });;
        Cart cart = new Cart();
        items.forEach(item -> cart.addItem(item.getProduct(), item.getQuantity()));

        Order order = new Order(cart);
        assert order.getItems().size() == items.size();
        assert order.getTotalAmount().equals(new BigDecimal("50.00"));
        assert order.getStatus() == OrderStatus.PENDING;
    }
}
