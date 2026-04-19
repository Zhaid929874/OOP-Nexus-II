import java.util.ArrayList;
import java.util.Scanner;

// ---------------- Interface ----------------
interface Meal {
    double calculateCost();
    void displayInfo();
    String getName();
}

// ---------------- Standard Meal ----------------
class StandardMeal implements Meal {

    private String name;
    private double basePrice;

    public StandardMeal(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateCost() {
        return basePrice * 1.2;
    }

    public void displayInfo() {
        System.out.println("Standard Meal: " + name);
        System.out.printf("Base Price: $%.2f%n", basePrice);
    }

    public String getName() {
        return name;
    }
}

// ---------------- Combo Meal ----------------
class ComboMeal implements Meal {

    private String name;
    private double basePrice;

    public ComboMeal(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateCost() {
        return basePrice * 2.5;
    }

    public void displayInfo() {
        System.out.println("Combo Meal: " + name);
        System.out.printf("Base Price: $%.2f%n", basePrice);
    }

    public String getName() {
        return name;
    }
}

// ---------------- Discount Meal ----------------
class DiscountMeal implements Meal {

    private String name;
    private double basePrice;
    private double discountPercentage;

    public DiscountMeal(String name, double basePrice, double discountPercentage) {
        this.name = name;
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
    }

    public double calculateCost() {
        return basePrice - (basePrice * discountPercentage);
    }

    public void displayInfo() {
        System.out.println("Discount Meal: " + name);
        System.out.printf("Base Price: $%.2f%n", basePrice);
        System.out.printf("Discount: %.2f%%%n", discountPercentage * 100);
    }

    public String getName() {
        return name;
    }
}

// ---------------- Meal Manager ----------------
class MealManager {

    private ArrayList<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        meals.add(meal);
        System.out.println("Meal added successfully.");
    }

    public boolean cancelMeal(String name) {
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getName().equalsIgnoreCase(name)) {
                meals.remove(i);
                return true;
            }
        }
        return false;
    }

    public double totalMealRevenue() {
        double total = 0;
        for (Meal m : meals) {
            total += m.calculateCost();
        }
        return total;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }
}

// ---------------- Main Class ----------------
public class Interface_Based_Meal_Management_System_Menu_Driven_ {

    private static Scanner scanner = new Scanner(System.in);
    private static MealManager MM = new MealManager();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Add Meal");
            System.out.println("2. Display Meals");
            System.out.println("3. Total Cost");
            System.out.println("4. Cancel Meal");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addMeal();
                    break;
                case 2:
                    displayMeals();
                    break;
                case 3:
                    System.out.printf("Total Cost: $%.2f%n", MM.totalMealRevenue());
                    break;
                case 4:
                    cancelMeal();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addMeal() {

        System.out.println("1.Standard  2.Combo  3.Discount");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Base Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        if (type == 1) {
            MM.addMeal(new StandardMeal(name, price));
        } else if (type == 2) {
            MM.addMeal(new ComboMeal(name, price));
        } else {
            System.out.print("Discount (0.10 = 10%): ");
            double d = Double.parseDouble(scanner.nextLine());
            MM.addMeal(new DiscountMeal(name, price, d));
        }
    }

    private static void displayMeals() {

        if (MM.getMeals().isEmpty()) {
            System.out.println("No meals available.");
            return;
        }

        for (Meal m : MM.getMeals()) {
            m.displayInfo();
            System.out.printf("Cost: $%.2f%n", m.calculateCost());
            System.out.println("----------------");
        }
    }

    private static void cancelMeal() {

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if (MM.cancelMeal(name)) {
            System.out.println("Canceled successfully.");
        } else {
            System.out.println("Not found.");
        }
    }
}