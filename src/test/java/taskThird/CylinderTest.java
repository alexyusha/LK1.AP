package taskThird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Cylinder cylinder1 = new Cylinder(-3, 1);
        Cylinder cylinder2 = new Cylinder(0, 1);
        Cylinder cylinder3 = new Cylinder(0, 0);
        Cylinder cylinder4 = new Cylinder(3, 3);

        assertEquals(0, cylinder1.volume());
        assertEquals(0, cylinder2.volume());
        assertEquals(0, cylinder3.volume());
        assertEquals(84.78, cylinder4.volume());

    }
}