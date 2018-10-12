package es.upm.miw.apaw.composite;

public abstract class CameraComponent {

    private String id;

    public CameraComponent(String id) {
        this.id = id;
    }

    public abstract boolean isComposite();

    public abstract void add(CameraComponent cameraComponent);

    public abstract void remove(CameraComponent cameraComponent);

    public String view() {
        return this.id;
    }
}
