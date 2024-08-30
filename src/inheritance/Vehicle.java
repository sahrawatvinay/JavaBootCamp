package inheritance;

public class Vehicle {
    int wheels;
    String color;

    void start() {
        System.out.println("Vehicle is starting");
    }

    Vehicle() {
        System.out.println("Creating a Vehicle instance");
    }

    Vehicle(int n) {
        this.wheels = n;
        System.out.println("Creating Vehicle with wheels");
    }
}
