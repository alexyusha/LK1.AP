package taskThird;

public class Ball extends Figure{
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        if (checkPosVal(radius)){
            return (double) 4/3*Figure.PI*Math.pow(radius,3);
        }
        else{
            return 0;
        }
    }
}
