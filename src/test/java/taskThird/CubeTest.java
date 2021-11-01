package taskThird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void volume() {
        Cube cube = new Cube(-3);
        Cube cube1 = new Cube(0);
        Cube cube2 = new Cube(3);

        assertEquals(0, cube.volume());
        assertEquals(0, cube1.volume());
        assertEquals(27.0, cube2.volume());
    }
}