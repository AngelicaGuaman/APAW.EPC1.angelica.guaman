package es.upm.miw.apaw.singleton.factory;

import es.upm.miw.apaw.entities.Photographer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhotographerFactoryTest {

    private Photographer photographer;

    @BeforeEach
    void before() {
        photographer = new Photographer("1", "angelica-guaman");
        PhotographerFactory.getFactory().addPhotographer(photographer);
    }

    @Test
    public void testGetPhotographer() {
        assertEquals(photographer, PhotographerFactory.getFactory().getPhotographer("1"));
    }

    @Test
    public void testGetPhotographerNull() {
        assertEquals(null, PhotographerFactory.getFactory().getPhotographer("10"));
    }

    @Test
    public void testAddPhotographer() {
        photographer = new Photographer("2", "ramiro-garcia");
        PhotographerFactory.getFactory().addPhotographer(photographer);
        assertEquals(2, PhotographerFactory.getFactory().getPhotographerFactorySize());
        PhotographerFactory.getFactory().removePhotographer("2");
    }

    @Test
    public void testRemovePhotographer() {
        PhotographerFactory.getFactory().removePhotographer("1");
        assertEquals(0, PhotographerFactory.getFactory().getPhotographerFactorySize());
    }

    @Test
    public void testGetPhotographersSize() {
        assertEquals(1, PhotographerFactory.getFactory().getPhotographerFactorySize());
    }

    @AfterAll
    public static void cleanUp() {
        PhotographerFactory.getFactory().removePhotographer("1");
        assertEquals(0, PhotographerFactory.getFactory().getPhotographerFactorySize());
    }
}
