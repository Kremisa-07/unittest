package com.example.eshop;

import com.example.eshop.product.DigitalProduct;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamDigitalProductTest {

    @ParameterizedTest
    @ValueSource(strings = {"something", "another thing", "12345", "!@#$%", ""})
    void nameTest(String name) {
        DigitalProduct product = new DigitalProduct(name, "desc", BigDecimal.ZERO, "http://example.com/download");
        assertEquals(name, product.getName());
    }
}
