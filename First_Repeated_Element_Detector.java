import java.util.HashSet;

public class First_Repeated_Element_Detector {
    public static void main(String[] args) {

        int[] arr = {5, 6, 2, 4, 9, 7, 2, 3};

        HashSet<Integer> value = new HashSet<>();

        for (int num : arr) {

            if (value.contains(num)) {
                System.out.println("First Repeated Value: " + num);
                return;
            }

            value.add(num);
        }

        System.out.println("NO Repeated Value Found!");
    }
}