package com.example.eshop.payment;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CreditCardPayermentProcessorKresadloTest {

    @Test
    void processPayment() {
        CreditCardPaymentProcessor processor = new CreditCardPaymentProcessor();
        BigDecimal amount = new BigDecimal("100.00");
        boolean result = processor.processPayment(amount);

        assert result;
    }

}
