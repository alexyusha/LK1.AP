package taskThird;

public abstract class Figure {
    public static final  double PI = 3.14;

    public abstract double volume();

    public boolean checkPosVal(Double...numbers){
        boolean value = true;
        for (Double num : numbers){
            if (num <= 0){
                value = false;
                System.out.println("Введенно отрицательное число");
                break;
            }
        }
        return value;
    }
}

