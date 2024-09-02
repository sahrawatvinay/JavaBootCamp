package abstraction;

/**
 * hide unnecessary details and only show needed information
 * abstract class in java can not be instanciated
 * can have both regular and abstract methods
 * we can create subclasses, all child classes must provide implementations
 * of all abstract methods
 * if there is atleast 1 abstract method in a class then we have to make
 * that class abstract as well
 * we can NOT extend multiple abstract classes
 *
 *
 * INTERFACES
 *
 */
public class LearnAbstraction {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle(); //error can not create objects
        Car c1 = new Car();
        c1.brake();
        c1.accelerate();
        System.out.println(c1.brakes(4));
    }
}

abstract class Vehicle {
    abstract void accelerate();

    abstract int brakes(int wheel);

    void brake() {
        System.out.println("Brakes called from abstract");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Accelerate car from subclass");
    }

    int brakes(int wheel) {
        return wheel;
    }
}
// must implement all the methods in Vehicle
//class Scooter extends Vehicle {
//    void accelerate (){
//        System.out.println("scooter accelerated");
//    }
//}
