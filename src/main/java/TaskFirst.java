import java.util.Arrays;

public class TaskFirst {
    public static int[] sortArray(int [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++){
                int temp;
                if (array[j-1] < array[j]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        int i;
        for (i = 0; i < array.length; i++){
            if (array[i] < 0){
                break;
            }
        }

        return Arrays.copyOfRange(array, 0, i);
    }
}
