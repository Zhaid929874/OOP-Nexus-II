
import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Addition_ArrayList_2D {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> firstMatrix = new ArrayList<>();
        ArrayList<ArrayList<Integer>> secondMatrix = new ArrayList<>();
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(sc.nextInt());
            }
            firstMatrix.add(row);
        }

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(sc.nextInt());
            }
            secondMatrix.add(row);
        }

        System.out.println("Result matrix:");

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> resultRow = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                resultRow.add(firstMatrix.get(i).get(j) + secondMatrix.get(i).get(j));
            }
            resultMatrix.add(resultRow);
        }

        System.out.println("\nFirst Matrix:");
        displayMatrix(firstMatrix);

        System.out.println("\nSecond Matrix:");
        displayMatrix(secondMatrix);

        System.out.println("\nResult Matrix:");
        displayMatrix(resultMatrix);

        sc.close();
    }

    public static void displayMatrix(ArrayList<ArrayList<Integer>> matrix) {

        for (ArrayList<Integer> row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}