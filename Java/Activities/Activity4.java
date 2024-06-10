package Activities;
import java.util.Arrays;
public class Activity4 {
    static void insertionSort(int array[]) {
        int i;

        for (i = 1; i < array.length; i++) {
            int num = array[i];
            int j = i - 1;

            while (j >= 0 && num < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = num;
        }
    }

    public static void main(String args[]) {
        int[] data = { 13, 8, 9, 5, 3 };
        insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }

}
