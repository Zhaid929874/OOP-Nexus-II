class Calculator {

    public void addInt(int a, int b) {
        int result = a + b;
        System.out.println("Addition of two integers: " + result);
    }

    public void addInt(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Addition of three integers: " + result);
    }

    public void subInt(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of two integers: " + result);
    }

    public void mulFloat(float a, float b) {
        float result = a * b;
        System.out.println("Multiplication of two floats: " + result);
    }

    public void mulFloat(float a, float b, float c) {
        float result = a * b * c;
        System.out.println("Multiplication of three floats: " + result);
    }
}

public class Method_Overloading_Calculator_Operations {

    public static void main(String[] args) {

        Calculator ca = new Calculator();

        ca.addInt(15, 25);
        ca.addInt(5, 10, 20);
        ca.subInt(35, 20);
        ca.mulFloat(1.50f, 5.20f);
        ca.mulFloat(2.25f, 3.50f, 4.75f);
    }
}