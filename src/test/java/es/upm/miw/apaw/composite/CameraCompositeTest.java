package es.upm.miw.apaw.composite;

import es.upm.miw.apaw.entities.Camera;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CameraCompositeTest {
    private Camera camera;
    private CameraComponent cameraLeaf;
    private CameraComponent cameraComposite;

    @BeforeEach
    public void before() {
        camera = new Camera("1");

        cameraLeaf = new CameraLeaf(camera);
        cameraComposite = new CameraComposite("Reflex 1");
        cameraComposite.add(cameraLeaf);
    }

    @Test
    public void testIsLeaf() {
        assertFalse(cameraLeaf.isComposite());
    }

    @Test
    public void testIsNotLeaf() {
        assertTrue(cameraComposite.isComposite());
    }

    @Test
    public void testRemoveCameraLeaf() {
        assertFalse(cameraLeaf.isComposite());
        assertEquals("1", cameraLeaf.view());
        assertEquals(1, ((CameraComposite) cameraComposite).getCameraComponentList().size());
        cameraComposite.remove(cameraLeaf);
        assertTrue(((CameraComposite) cameraComposite).getCameraComponentList().isEmpty());
    }

    @Test
    public void testCheckCamera() {
        assertEquals(camera, ((CameraLeaf) cameraLeaf).getCamera());
    }
}
