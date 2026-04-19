class Vehicle1 {

    public void brake() {
        System.out.println("Brake pressed");
    }
}

class Car1 extends Vehicle1 {

    public Car1() {
        super.brake();
        System.out.println("I am in car class");
    }

    public void display() {
        System.out.println("Child class Display");
    }
}

public class Constructor_Inheritance_SuperMethod_Call {

    public static void main(String[] args) {

        Car1 abc = new Car1();
        abc.display();
    }
}