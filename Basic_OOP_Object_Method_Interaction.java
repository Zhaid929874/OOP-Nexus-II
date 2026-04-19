
public class Basic_OOP_Object_Method_Interaction {

    public static void main(String[] args) {

        Car bmwCar = new Car();
        bmwCar.braking();

        Lamp led = new Lamp();
        led.turnOn();
    }
}

class Car {

    private int gear = 5;

    public void braking() {
        System.out.println("Car braking");
    }
}

class Lamp {

    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Lamp is turned on");
    }
}