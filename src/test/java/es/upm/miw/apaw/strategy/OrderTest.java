package es.upm.miw.apaw.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    private Order order;

    @BeforeEach
    void before() {
        this.order = new Order();
    }

    @Test
    public void testExpressDeliveryConcreteStrategy() {
        ShippingStrategy expressDelivery = new ExpressDeliveryConcreteStrategy();
        order.setShippingStrategy(expressDelivery);
        assertEquals("We will deliver your order before 24 hours.", order.printShippingOrderMethod());
    }

    @Test
    public void testHomeDeliveryConcreteStrategy() {
        ShippingStrategy homeDelivery = new HomeDeliveryConcreteStrategy();
        order.setShippingStrategy(homeDelivery);
        assertEquals("We will deliver your order in your home.", order.printShippingOrderMethod());
    }

    @Test
    public void testPickUpInStoreConcreteStrategy() {
        ShippingStrategy pickUpInStore = new PickUpInStoreConcreteStrategy();
        order.setShippingStrategy(pickUpInStore);
        assertEquals("You have to pick your order up in the shop.", order.printShippingOrderMethod());
    }

    @Test
    public void testConstructorExpressDeliveryConcreteStrategy() {
        ShippingStrategy expressDelivery = new ExpressDeliveryConcreteStrategy();
        order = new Order(expressDelivery);
        assertEquals("We will deliver your order before 24 hours.", order.printShippingOrderMethod());
    }

    @Test
    public void testConstructorHomeDeliveryConcreteStrategy() {
        ShippingStrategy homeDelivery = new HomeDeliveryConcreteStrategy();
        order = new Order(homeDelivery);
        assertEquals("We will deliver your order in your home.", order.printShippingOrderMethod());
    }

    @Test
    public void testConstructorPickUpInStoreConcreteStrategy() {
        ShippingStrategy pickUpInStore = new PickUpInStoreConcreteStrategy();
        order = new Order(pickUpInStore);
        assertEquals("You have to pick your order up in the shop.", order.printShippingOrderMethod());
    }
}
