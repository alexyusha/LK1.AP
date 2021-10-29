package taskThird;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    public  static List<Figure> figures = new ArrayList<>();
    static {
        figures.add(new Cylinder(5, 10));
        figures.add(new Cube(5));
        figures.add(new Ball(5));
    }
    @Test
    void sort() {
        List<Figure> figures1 = Sort.sort(figures, sortType.INCREASE);
        List<Figure> sortedFigure1 = new ArrayList<>();
        sortedFigure1.add(new Cube(5));
        sortedFigure1.add(new Ball(5));
        sortedFigure1.add(new Cylinder(5, 10));

        for (int i = 0; i < figures1.size(); i++){
            assertEquals(sortedFigure1.get(i).volume(), figures1.get(i).volume());
        }

        List<Figure> figures2 = Sort.sort(figures, sortType.DECREASE);
        List<Figure> sortedFigure2 = new ArrayList<>();
        sortedFigure2.add(new Cylinder(5, 10));
        sortedFigure2.add(new Ball(5));
        sortedFigure2.add(new Cube(5));

        for (int i = 0; i < figures2.size(); i++){
            assertEquals(sortedFigure2.get(i).volume(), figures2.get(i).volume());
        }
    }
}