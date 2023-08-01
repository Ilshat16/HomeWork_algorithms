import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[8];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new Random().nextInt(22);
//        }
//        System.out.println(Arrays.toString(array));
//        int result = HeapSort.heapSort(array, array.length);
//        System.out.println(Arrays.toString(array));
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.print();
        linkedList.reversal();
        linkedList.print();
    }
}
