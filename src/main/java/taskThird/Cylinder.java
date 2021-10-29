package taskThird;

public class Cylinder extends Figure{
    private double radius;
    private double high;

    public Cylinder(double radius, double high) {
        this.radius = radius;
        this.high = high;
    }

    @Override
    public double volume() {
        return Figure.getPI() * Math.pow(radius, 2) * high;
    }
}
