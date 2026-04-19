class Animal {

    public String species;

    public Animal(String a) {
        this.species = a;
    }

    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Mammal extends Animal {

    public boolean hasFur;

    public Mammal(String a, boolean h) {
        super(a);
        this.hasFur = h;
    }

    public void displayMammalCharacteristics() {
        if (hasFur) {
            System.out.println("This mammal has fur");
        } else {
            System.out.println("This mammal does not have fur");
        }
    }
}

class Dog extends Mammal {

    public String breed;

    public Dog(String a, boolean h, String b) {
        super(a, h);
        this.breed = b;
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class Multilevel_Inheritance_Animal_Mammal_Dog {

    public static void main(String[] args) {

        Dog d = new Dog("Canine", true, "Golden Retriever");

        d.displaySpecies();
        d.displayMammalCharacteristics();
        d.displayBreed();
    }
}