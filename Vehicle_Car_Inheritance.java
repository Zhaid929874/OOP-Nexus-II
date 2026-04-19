class Vehicle {

    public String name;

    public void stop() {
        System.out.println("Brake pressed");
    }
}

class Car extends Vehicle {

    public void display() {
        System.out.println("This is " + name);
    }
}

public class Vehicle_Car_Inheritance {

    public static void main(String[] args) {

        Car abc = new Car();
        abc.name = "Tesla";

        abc.display();
        abc.stop();
    }
}