package com.example.eshop;
import com.example.eshop.product.DigitalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class DigitalProductTest {

    @Test
    void createDigitalProduct() {

        String name = "something";
        String description = "something";
        BigDecimal price = new BigDecimal("10.00");
        String url = "https://example.com/download/something";

        DigitalProduct product = new DigitalProduct(name, description, price, url);
        assert product.getName().equals(name);
        assert product.getDescription().equals(description);
        assert product.getPrice().equals(price);
        assert product.getDownloadUrl().equals(url);
    }
}
