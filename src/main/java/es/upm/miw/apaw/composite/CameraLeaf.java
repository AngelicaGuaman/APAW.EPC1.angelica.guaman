package es.upm.miw.apaw.composite;

import es.upm.miw.apaw.entities.Camera;

public class CameraLeaf extends CameraComponent {

    private Camera camera;

    public CameraLeaf(Camera camera) {
        super(camera.getId());
        this.camera = camera;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(CameraComponent cameraComponent) {

    }

    @Override
    public void remove(CameraComponent cameraComponent) {

    }

    public String view() {
        return super.view();
    }

    public Camera getCamera() {
        return camera;
    }
}
