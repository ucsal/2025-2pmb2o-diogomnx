package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    @Test
    void partner_gets_12_percent() {
        Map<CustomerType, DiscountPolicy> policies = new HashMap<>();
        policies.put(CustomerType.REGULAR, new RegularDiscountPolicy());
        policies.put(CustomerType.PREMIUM, new PremiumDiscountPolicy());
        policies.put(CustomerType.PARTNER, new PartnerDiscountPolicy());
        var calc = new DiscountCalculator(policies);
        assertEquals(88.0, calc.apply(100.0, CustomerType.PARTNER), 0.0001,
            "PARTNER deveria ter 12% de desconto");
    }
}
