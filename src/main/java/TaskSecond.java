import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TaskSecond {
    public static  Map<String, Integer>  parsing(List<String> list, int count){
        HashMap<String, Integer> hashMapTags = new HashMap<>();
        for (String str : list){
            String[] strings = str.split(" ");
            HashSet<String> worlds = new HashSet<>();
            for (int i = 0; i < strings.length; i++){
                if (strings[i].contains("#") && strings[i].length() > 1){
                    worlds.add(strings[i]);
                }
            }

            for (String world : worlds){
                if (hashMapTags.containsKey(world)){
                    int value = hashMapTags.get(world);
                    hashMapTags.put(world, value+1);
                }else{
                    hashMapTags.put(world, 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list1 = new LinkedList<>(hashMapTags.entrySet());
        Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() > o2.getValue()){
                    return -1;
                }
                else if (o1.getValue() < o2.getValue()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        if (count > list1.size()){
            count = list.size();
        }
        int index = 0;

        for (Map.Entry<String, Integer> entry : list1)
        {
            if (index < count){
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            index++;
        }

      /*hashMapTags.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .forEach(System.out :: println);
*/
        return sortedMap;
    }
}

