package com.example.eshop.order;

import com.example.eshop.cart.Cart;
import com.example.eshop.payment.PaymentProcessor;
import com.example.eshop.product.PhysicalProduct;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OrderServiceKresadloTest {

    @Test
    void placeOrderTest() {
        Product product = new Product("Test Product", "This is a test product", new BigDecimal("19.99")) {};

        Cart cart = new Cart();
        cart.addItem(product, 10);
        PaymentProcessor paymentProcessor = amount -> true;

        OrderService orderService = new OrderService(paymentProcessor);
        Order order = orderService.placeOrder(cart);

        assert !order.getItems().isEmpty();
    }

}
