package es.upm.miw.apaw.strategy;

public class ExpressDeliveryConcreteStrategy implements ShippingStrategy {
    @Override
    public String sendOrder() {
        return "We will deliver your order before 24 hours.";
    }
}
