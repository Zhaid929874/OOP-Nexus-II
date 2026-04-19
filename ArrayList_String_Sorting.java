import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_String_Sorting {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);

        System.out.println("Sorted Cars Array List:");

        for (String car : cars) {
            System.out.println(car);
        }
    }
}