import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TaskFirstTest {

    @org.junit.jupiter.api.Test
    void sortArray() {
        int[] arrayTest1 = new int[]{5, -5, 8, 1, -9, -10, 0, 10};
        int[] arrayTest2 = new int[]{2, 4, 5, 1, 8, 2};
        int[] arrayTest3 = new int[]{-2, -4, -5, -1, -8, -2};
        int[] arrayTest4 = new int[]{0, 0, 0, 0, 0, 0};
        int[] arrayTest5 = new int[]{5, 5, 5, 5, 5, 5};
        int[] arrayTest6 = null;

        int[] sortedArray1 = new int[]{10, 8, 5, 1, 0};
        int[] sortedArray2 = new int[]{8, 5, 4, 2, 2, 1};
        int[] sortedArray3 = new int[]{};
        int[] sortedArray4 = new int[]{0, 0, 0, 0, 0, 0};
        int[] sortedArray5 = new int[]{5, 5, 5, 5, 5, 5};

        int[] sortArray1 = TaskFirst.sortArray(arrayTest1);
        int[] sortArray2 = TaskFirst.sortArray(arrayTest2);
        int[] sortArray3 = TaskFirst.sortArray(arrayTest3);
        int[] sortArray4 = TaskFirst.sortArray(arrayTest4);
        int[] sortArray5 = TaskFirst.sortArray(arrayTest5);
        int[] sortArray6 = TaskFirst.sortArray(arrayTest6);

        assertArrayEquals(sortedArray1, sortArray1);
        assertArrayEquals(sortedArray2, sortArray2);
        assertArrayEquals(sortedArray3, sortArray3);
        assertArrayEquals(sortedArray4, sortArray4);
        assertArrayEquals(sortedArray5, sortArray5);
        assertNull(sortArray6);
    }
}