
import java.util.ArrayList;

public class ArrayList_Basic_Operations {

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();

        System.out.println("Size of ArrayList: " + data.size());

        data.add(10);
        data.add(20);
        data.add(1, 30);
        data.add(3, 40);

        System.out.println("Is 30 inside the ArrayList: " + data.contains(30));
        System.out.println("30 is at index: " + data.indexOf(30));

        System.out.println("Size of ArrayList: " + data.size());
        System.out.println("ArrayList values: " + data);

        data.remove(1);
        System.out.println("After removing index 1: " + data);

        data.clear();
        System.out.println("All elements removed: " + data);
    }
}