import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TaskSecondTest {
    public  static List<String> list = new ArrayList<>();
    public  static List<String> listAnswer = new ArrayList<>();
        static {
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

            listAnswer.add("#fbf 10");
            listAnswer.add("#fbfvdgvbvdfbgs 9");
            listAnswer.add("#Hello 8");
            listAnswer.add("#Alex 4");
            listAnswer.add("#H 3");
        }

    @Test
    void parsing() {
        Map<String, Integer> map = TaskSecond.parsing(list, 5);
        int index = 0;
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            assertEquals(listAnswer.get(index), (pair.getKey() + " " + pair.getValue()));
            index++;
        }
    }
}