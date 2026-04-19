interface Meal {
    double calculateCost();
    void displayInfo();
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
        return basePrice * 1.2; // 20% extra
    }

    public void displayInfo() {
        System.out.println("Standard Meal: " + name);
        System.out.printf("Base Price: $%.2f%n", basePrice);
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
}

// ---------------- Main Class ----------------
public class Interface_Based_Meal_Cost_Calculator_System {

    public static void main(String[] args) {

        StandardMeal sm = new StandardMeal("Rice", 150);
        ComboMeal cm = new ComboMeal("Fried Chicken", 250);
        DiscountMeal dm = new DiscountMeal("Student Meal", 350, 0.35);

        sm.displayInfo();
        System.out.printf("Cost: $%.2f%n%n", sm.calculateCost());

        cm.displayInfo();
        System.out.printf("Cost: $%.2f%n%n", cm.calculateCost());

        dm.displayInfo();
        System.out.printf("Cost: $%.2f%n", dm.calculateCost());
    }
}