import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(22);
        }
        System.out.println(Arrays.toString(array));
        int result = heapSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static int heapSort(int[] array, int length) {
        if (length == 1)
            return -1;
        int start = length / 2 - 1;
        for (int i = start; i >= 0; i--) {
            if (array[i] < array[2 * i + 1]){
                int temp = array[i];
                array[i] = array[2 * i + 1];
                array[2 * i + 1] = temp;
            }
            if ((2 * i + 2) < length && array[i] < array[2 * i + 2]  ) {
                int temp = array[i];
                array[i] = array[2 * i + 2];
                array[2 * i + 2] = temp;
            }
        }
        int temp = array[0];
        array[0] = array[length - 1];
        array[length - 1] = temp;
        heapSort(array, length - 1);
        return 1;
    }

}