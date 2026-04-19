public class Static_Method_GetterSetter_Constructor_OOP {

    public static void main(String[] args) {

        // Static method call
        System.out.println("Static methods: " + StaticClass.add(5, 6));

        // Getter & Setter
        GetterSetter gs = new GetterSetter();
        gs.setName("Eastern");
        System.out.println("Getter and setter: " + gs.getName());

        // Constructor
        ConstructorDemo c = new ConstructorDemo();
        System.out.println("Constructor: " + c.name);
    }
}

// ---------------- Static Class ----------------
class StaticClass {

    static int add(int a, int b) {
        return a + b;
    }
}

// ---------------- Getter Setter Class ----------------
class GetterSetter {

    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

// ---------------- Constructor Class ----------------
class ConstructorDemo {

    String name;

    public ConstructorDemo() {
        name = "ZAHID";
    }
}