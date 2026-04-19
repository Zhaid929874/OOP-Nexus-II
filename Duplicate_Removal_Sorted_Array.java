
import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate_Removal_Sorted_Array {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 4, 1, 5};

        Arrays.sort(arr);

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int num : arr) {
            if (!arrList.contains(num)) {
                arrList.add(num);
            }
        }

        System.out.println("Array after removing duplicates: " + arrList);
    }
}