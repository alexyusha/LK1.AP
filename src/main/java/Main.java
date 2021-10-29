import taskThird.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
       /* int[] array = new int[]{16 ,5, -5, 8, 1, -9, -10, 0, 10, 20};
        int[] sortedArray = new int[]{10, 8, 5,1};
        int[] sortArray = TaskFirst.sortArray(array);

        for (int i = 0; i < sortArray.length; i++){
            System.out.println(sortArray[i]);
        }*/

        //2
        List<String> list = new ArrayList<>();
        list.add("Hello my name #Alex #Alex");
        list.add("Hello !!!");
        list.add("#Hello #my #name #Alex");
        list.add("#Hello #my #name #Alex");
        list.add("#Hello #my #name #Alex");
        list.add("#Hello my name");
        list.add("#Hello my name");
        list.add("#Hello my name");
        list.add("#Hello my name");
        list.add("#Hello my name");
        list.add("#He my name");
        list.add("#He my name");
        list.add("#H my name");
        list.add("#H my name");
        list.add("#H my name");
        list.add("# my name");
        list.add("# my name");
        list.add("#fg my name");
        list.add("#fg my name");
        list.add("#fb my name");
        list.add("#fb my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbf my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");
        list.add("#fbfvdgvbvdfbgs my name");


        Map<String, Integer>  hashMap = TaskSecond.parsing(list, 5);


        for (Map.Entry<String , Integer> pair : hashMap.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

       //3
        /*List<Figure> figures = new ArrayList<>();
        figures.add(new Cylinder(5, 10));
        figures.add(new Cube(5));
        figures.add(new Ball(5));

        List<Figure> figures1 = Sort.sort(figures, sortType.DECREASE);
        for (Figure f : figures1){
            System.out.println(f.getClass().getName() + " " + f.volume());
        }
*/
    }

}
