public class AccessModifiers_Demo {

    public static void main(String[] args) {

        FinalKeyword fk = new FinalKeyword();
        System.out.println("Final Value: " + fk.value);

        ThisKeyword tk = new ThisKeyword(56);

        AccessModifiers am = new AccessModifiers();
        System.out.println("Public data: " + am.Pub_data);
        System.out.println("Protected data: " + am.Pro_data);
        System.out.println("Default data: " + am.data);
    }
}

// ---------------- Final Keyword ----------------
class FinalKeyword {
    final int value = 56;
}

// ---------------- This Keyword ----------------
class ThisKeyword {

    int x;

    ThisKeyword(int x) {
        this.x = x;
        System.out.println("This Reference: " + this);
    }
}

// ---------------- Access Modifiers ----------------
class AccessModifiers {

    private int Pri_data = 6;
    protected int Pro_data = 15;
    public int Pub_data = 25;
    int data = 10;
}