public class Indexed_Array_Manipulation_ChronoCheck {
    public static void main(String[] args) {

        int ID[] = new int[6];

        ID[0] = 1;
        ID[1] = 2;
        ID[2] = 3;
        ID[3] = 4;
        ID[4] = 5;
        ID[5] = 6;

        System.out.println("ID[0]: " + ID[0]);
        System.out.println("ID[1]: " + ID[1]);
        System.out.println("ID[2]: " + ID[2]);
        System.out.println("ID[3]: " + ID[3]);
        System.out.println("ID[4]: " + ID[4]);
        System.out.println("ID[5]: " + ID[5]);

        System.out.println("Array length: " + ID.length);

        // shifting elements
        for (int k = 1; k <= 3; k++) {
            ID[k] = ID[k + 1];
            System.out.println("Values ID[" + k + "]: " + ID[k]);
        }

        // print array
        for (int k = 0; k < ID.length - 1; k++) {
            System.out.println("Values is ID[" + k + "]: " + ID[k]);
        }
    }
}