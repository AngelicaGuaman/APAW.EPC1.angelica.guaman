package es.upm.miw.apaw.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> products;
    private ShippingStrategy shippingStrategy;

    public Order(){
        this.products = new ArrayList<>();
    }
    public Order(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
        this.products = new ArrayList<>();
    }
    
    public String printShippingOrderMethod() {
        return shippingStrategy.sendOrder();
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
}
