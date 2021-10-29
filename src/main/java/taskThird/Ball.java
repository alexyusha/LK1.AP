package taskThird;

public class Ball extends Figure{
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (double) 4/3*Figure.getPI()*Math.pow(radius,3);
    }
}
