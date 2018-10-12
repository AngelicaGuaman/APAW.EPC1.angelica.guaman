package es.upm.miw.apaw.composite;

import java.util.ArrayList;
import java.util.List;

public class CameraComposite extends CameraComponent {

    private List<CameraComponent> cameraComponentList;

    public CameraComposite(String name) {
        super(name);
        this.cameraComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(CameraComponent cameraComponent) {
        assert cameraComponent != null;
        cameraComponentList.add(cameraComponent);
    }

    @Override
    public void remove(CameraComponent cameraComponent) {
        assert cameraComponent != null;
        cameraComponentList.remove(cameraComponent);
    }

    public List<CameraComponent> getCameraComponentList() {
        return cameraComponentList;
    }

    @Override
    public String view() {
        return null;
    }
}
