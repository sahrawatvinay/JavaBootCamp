package inheritance;

/*
 - Allows us to create new class from existing class
 - newly created class is called subclass, child, derived class
 - existing class is called super class, parent, base
 - we can not extend multiple classes
 - if subclass provides specific implementation of the method that
 has been declared by one of its parent class, is called method overriding
 - aka runtime polymorphism so polymorphism can be achieved using inheritance
 - super is used to access constructor/ methods of immediate parent class
 - final is used to stop variable from reassignment, methods to stop getting overridden by subclassed
 - final class is used to block inheritance
 - super/this should be the 1st call inside constructor
 - both can not be called simultaneously
 */
public class Car extends Vehicle {
    String model;

    void start() {
        System.out.println(this.model + "is about to start");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.wheels = 4;
        c1.color = "black";
        c1.model = "bmw";
        c1.start();
    }

    Car() {
        super(3); //used to refer to instance of immediate parent class, invokes methods/constructor of immediate parent class;
        System.out.println("Car is being created");
    }
}
