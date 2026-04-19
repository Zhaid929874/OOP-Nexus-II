import java.util.Scanner;

public class Income_Tax_Slab_Calculator_ChronoCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your annual salary:");
        double salary = input.nextDouble();

        double tax;

        if (salary <= 50000) {
            tax = 0;
        }
        else if (salary <= 100000) {
            tax = (salary - 50000) * 0.10;
        }
        else {
            tax = (50000 * 0.10) + (salary - 100000) * 0.20;
        }

        System.out.println("Your income tax is: $" + tax);

        input.close();
    }
}