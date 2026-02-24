package com.example.eshop;

import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PhysicalProductTest {

    @Test
    void createPhysicalProduct() {
        double weight = 100.0;
        BigDecimal price = new BigDecimal("10.00");

        PhysicalProduct product = new PhysicalProduct("something", "something", price, weight, new BigDecimal("5.00"));
        assert product.getName().equals("something");
        assert product.getDescription().equals("something");
        assert product.getPrice().equals(price);
        assert product.getWeight() == weight;
        assert product.getShippingCost().equals(new BigDecimal("5.00"));
    }


}
