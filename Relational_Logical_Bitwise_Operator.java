
public class Relational_Logical_Bitwise_Operator {
    public static void main(String[] args) {

        int Num1 = 10;
        int Num2 = 5;
        int Num3 = 15;

        // Logical AND
        System.out.println(Num1 < Num2 && Num1 < Num3);

        // Bitwise AND
        System.out.println(Num1 < Num2 & Num1 < Num3);

        // Logical OR
        System.out.println(Num1 < Num2 || Num1 < Num3);

        // Bitwise OR
        System.out.println(Num1 < Num2 | Num1 < Num3);

        // Mixed increment/decrement cases
        System.out.println(Num1++ < Num2 && Num1 < Num3);
        System.out.println("Num1: " + Num1 + " Num2: " + Num2 + " Num3: " + Num3);

        System.out.println(Num1 < --Num2 && ++Num1 < Num3--);
        System.out.println("Num1: " + Num1 + " Num2: " + Num2 + " Num3: " + Num3);

        System.out.println(Num1 > --Num2 && ++Num2 < Num3++);
        System.out.println("Num1: " + Num1 + " Num2: " + Num2 + " Num3: " + Num3);

        System.out.println(Num2++ < Num3 && ++Num2 < Num1++);
        System.out.println("Num1: " + Num1 + " Num2: " + Num2 + " Num3: " + Num3);
    }
}