package taskThird;

public class Cube extends Figure{
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        if (checkPosVal(length)){
            return Math.pow(length, 3);
        }
        else{
            return 0;
        }
    }
}
