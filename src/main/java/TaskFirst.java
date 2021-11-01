import java.util.Arrays;

public class TaskFirst {
    public static int[] sortArray(int[] array) {
        try {
            int countPos = 0;
            int[] arrayPosNum = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    arrayPosNum[countPos] = array[i];
                    countPos++;
                }
            }

            for (int i = 0; i < arrayPosNum.length; i++) {
                for (int j = 1; j < arrayPosNum.length; j++) {
                    int temp;
                    if (arrayPosNum[j - 1] < arrayPosNum[j]) {
                        temp = arrayPosNum[j];
                        arrayPosNum[j] = arrayPosNum[j - 1];
                        arrayPosNum[j - 1] = temp;
                    }
                }
            }

            return Arrays.copyOfRange(arrayPosNum, 0, countPos);
        } catch (NullPointerException e) {
            System.out.println("Ошибка значение null");
            return null;
        }
    }
    }
//}

