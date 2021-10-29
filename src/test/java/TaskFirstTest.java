import static org.junit.jupiter.api.Assertions.*;

class TaskFirstTest {

    @org.junit.jupiter.api.Test
    void sortArray() {
        int[] array = new int[]{5, -5, 8, 1, -9, -10, 0, 10};
        int[] sortedArray = new int[]{10, 8, 5, 1, 0};
        int[] sortArray = TaskFirst.sortArray(array);

        for (int i = 0; i < sortedArray.length; i++){
            assertEquals(sortedArray[i], sortArray[i]);
        }
    }
}