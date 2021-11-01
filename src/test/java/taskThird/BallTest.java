package taskThird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void volume() {
        Ball ball = new Ball(-5);
        Ball ball1 = new Ball(0);
        Ball ball2 = new Ball(10);

        assertEquals(0, ball.volume());
        assertEquals(0, ball1.volume());
        assertEquals(4186.666666666667, ball2.volume());
    }
}