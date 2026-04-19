
public class Semester_CGPA_Calculator_Array {
    public static void main(String[] args) {

        double[] arr = {3.70, 3.75, 3.60, 3.65};

        double cgpa = calculateCGPA(arr);

        System.out.println("5th semester CGPA: " + cgpa);
    }

    public static double calculateCGPA(double[] arr) {

        double total = 0;

        for (double gp : arr) {
            total += gp;
        }

        return total / arr.length;
    }
}