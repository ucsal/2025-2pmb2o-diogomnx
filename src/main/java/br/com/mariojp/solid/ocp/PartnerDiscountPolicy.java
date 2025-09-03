package br.com.mariojp.solid.ocp;

public class PartnerDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.88;
    }
}
