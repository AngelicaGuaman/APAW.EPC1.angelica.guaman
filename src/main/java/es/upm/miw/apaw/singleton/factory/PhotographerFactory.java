package es.upm.miw.apaw.singleton.factory;

import es.upm.miw.apaw.entities.Photographer;
import es.upm.miw.apaw.observer.Observable;

import java.util.HashMap;
import java.util.Map;

public class PhotographerFactory extends Observable {
    private Map<String, Photographer> photographers;

    private static final PhotographerFactory factory = new PhotographerFactory();

    private PhotographerFactory() {
        this.photographers = new HashMap<>();
    }

    public Photographer getPhotographer(String key) {
        for (Map.Entry<String, Photographer> entry : photographers.entrySet()) {
            if (entry.getKey().equals(key)) {
                return this.photographers.get(key);
            }
        }

        return null;
    }

    public void addPhotographer(Photographer photographer) {
        this.photographers.put(photographer.getId(), photographer);
        this.notifyObservers();
    }

    public void removePhotographer(String key) {
        this.photographers.remove(key);
        this.notifyObservers();
    }

    public int getPhotographerFactorySize() {
        return this.photographers.size();
    }

    public static PhotographerFactory getFactory() {
        return factory;
    }
}
