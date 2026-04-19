public class Income_Tax_Slab_Calculator {
    public static void main(String[] args) {

        double salary = 75000;
        double taxRate = 0;

        if (salary < 20000) {
            taxRate = 0;
        }
        else if (salary <= 30000) {
            taxRate = 0.02;
        }
        else if (salary <= 50000) {
            taxRate = 0.03;
        }
        else if (salary <= 100000) {
            taxRate = 0.05;
        }
        else if (salary <= 500000) {
            taxRate = 0.07;
        }
        else {
            taxRate = 0.10;
        }

        double tax = taxRate * salary;

        System.out.println("Total Amount of Tax: " + tax + " Taka");
    }
}