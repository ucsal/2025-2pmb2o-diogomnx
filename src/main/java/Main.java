import br.com.mariojp.solid.ocp.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<CustomerType, DiscountPolicy> policies = new HashMap<>();
		policies.put(CustomerType.REGULAR, new RegularDiscountPolicy());
		policies.put(CustomerType.PREMIUM, new PremiumDiscountPolicy());
		policies.put(CustomerType.PARTNER, new PartnerDiscountPolicy());

		DiscountCalculator calc = new DiscountCalculator(policies);

		System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
	}
}
