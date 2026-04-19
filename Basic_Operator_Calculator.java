import java.util.Scanner;

public class Basic_Operator_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first element: ");
        float Num1 = input.nextFloat();

        System.out.println("Enter second element: ");
        float Num2 = input.nextFloat();

        System.out.println("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        float result;

        if (operator == '+') {
            result = Num1 + Num2;
            System.out.println("Result: " + result);
        }
        else if (operator == '-') {
            result = Num1 - Num2;
            System.out.println("Result: " + result);
        }
        else if (operator == '*') {
            result = Num1 * Num2;
            System.out.println("Result: " + result);
        }
        else if (operator == '/') {
            if (Num2 != 0) {
                result = Num1 / Num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        }
        else if (operator == '%') {
            result = Num1 % Num2;
            System.out.println("Result: " + result);
        }
        else {
            System.out.println("Invalid operator!");
        }

        input.close();
    }
}