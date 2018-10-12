package es.upm.miw.apaw.observer;

import es.upm.miw.apaw.singleton.factory.PhotographerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverA implements Observer {

    private Logger logger = LogManager.getLogger(this.getClass());

    public ObserverA() {
        PhotographerFactory.getFactory().addObserver(this);
    }

    @Override
    public void update() {
        logger.info("Observer A: Se ha actualizado la lista de fotógrafos: " + PhotographerFactory.getFactory().getPhotographerFactorySize());
    }
}
