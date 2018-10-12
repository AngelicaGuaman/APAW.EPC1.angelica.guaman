package es.upm.miw.apaw.strategy;

public class HomeDeliveryConcreteStrategy implements ShippingStrategy {
    @Override
    public String sendOrder() {
        return "We will deliver your order in your home.";
    }
}
