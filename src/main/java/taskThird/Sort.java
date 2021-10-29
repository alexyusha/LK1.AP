package taskThird;

import java.util.*;

public class Sort {
    public static List<Figure> sort(Collection<Figure> collection, sortType type){
        Comparator<Figure> comparator;
        if (type.equals(sortType.DECREASE)){
            comparator = new FigureVolumeSortD();
        }
        else{
            comparator = new FigureVolumeSortI();
        }

        List<Figure> figures = new ArrayList<>();
        figures.addAll(collection);
        figures.sort(comparator);

        return figures;
    }
}

class FigureVolumeSortD implements Comparator<Figure>{
    public int compare(Figure a, Figure b){
        if (a.volume() > b.volume()){
            return -1;
        }
        else if(a.volume() < b.volume()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
class FigureVolumeSortI implements Comparator<Figure>{
    public int compare(Figure a, Figure b){
        if (a.volume() > b.volume()){
            return 1;
        }
        else if(a.volume() < b.volume()){
            return -1;
        }
        else {
            return 0;
        }
    }
}

