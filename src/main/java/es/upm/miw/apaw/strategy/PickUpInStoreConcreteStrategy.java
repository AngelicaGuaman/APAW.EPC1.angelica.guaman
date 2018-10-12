package es.upm.miw.apaw.strategy;

public class PickUpInStoreConcreteStrategy implements ShippingStrategy {
    @Override
    public String sendOrder() {
        return "You have to pick your order up in the shop.";
    }
}
