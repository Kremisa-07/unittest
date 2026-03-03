package com.example.eshop.product;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamDigitalProductKresadloTest {
    String basicDesc = "description";
    BigDecimal basicPrice = new BigDecimal("10.00");
    String basicUrl = "https://example.com/download";

    @ParameterizedTest
    @ValueSource(strings = {"something", "another thing", "12345", "!@#$%", ""})
    void nameTest(String name) {
        DigitalProduct product = new DigitalProduct(name, basicDesc, basicPrice, basicUrl);
        assertEquals(name, product.getName());
    }
}
