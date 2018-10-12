package es.upm.miw.apaw.observer;

import es.upm.miw.apaw.entities.Photographer;
import es.upm.miw.apaw.singleton.factory.PhotographerFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObservableTest {

    @Test
    void testWithTwoObservers() {
        new ObserverA();
        new ObserverB();

        assertEquals(0, PhotographerFactory.getFactory().getPhotographerFactorySize());

        PhotographerFactory.getFactory().addPhotographer(new Photographer("1", "angelica"));

        assertEquals(1, PhotographerFactory.getFactory().getPhotographerFactorySize());

        PhotographerFactory.getFactory().removePhotographer("1");

        assertEquals(0, PhotographerFactory.getFactory().getPhotographerFactorySize());
    }
}
