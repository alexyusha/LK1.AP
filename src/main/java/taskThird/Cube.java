package taskThird;

public class Cube extends Figure{
    private double length;

    public Cube(float length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}
