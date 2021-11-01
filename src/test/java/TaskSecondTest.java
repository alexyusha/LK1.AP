import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TaskSecondTest {
    public  static List<String> list = new ArrayList<>();
    public  static List<String> listAnswer = new ArrayList<>();

    public static List<String> list1 = new ArrayList<>();
    public static List<String> listAnswer1 = new ArrayList<>();

        static {
            list.add("Hello my name #Alex #Alex");
            list.add("Hello !!!");
            list.add("#Hello #my #name #Alex");
            list.add("#Hello #my #name #Alex");
            list.add("#Hel#lo #my #name #Alex");
            list.add("#Hello my name");
            list.add("#Hello my name");
            list.add("#Hello my name");
            list.add("#Hello my name");
            list.add("#Hello my name");
            list.add("#He my name");
            list.add("#He my name");
            list.add("#H my name");
            list.add("#H my name");
            list.add("##H my name");
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
            list.add(null);
            list.add("");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs my name");
            list.add("#fbfvdgvbvdfbgs m#y na#me");
            list.add("#fbfvdg#vbvdfbgs m#y na#me");

            listAnswer.add("#fbf 8");
            listAnswer.add("#fbfvdgvbvdfbgs 8");
            listAnswer.add("#Hello 7");
            listAnswer.add("#Alex 4");
            listAnswer.add("#name 3");
        }

    @Test
    void parsing() {
        Map<String, Integer> map = TaskSecond.parsing(list, 5);
        int index = 0;
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            assertEquals(listAnswer.get(index), (pair.getKey() + " " + pair.getValue()));
            index++;
        }

        Map<String, Integer> map1 = TaskSecond.parsing(list1, 5);
        int index1 = 0;
        for(Map.Entry<String, Integer> pair : map1.entrySet()){
            assertEquals(listAnswer1.get(index), (pair.getKey() + " " + pair.getValue()));
            index1++;
        }
    }
}