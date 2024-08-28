package oops;

class Dog {
    String name;
    int age;
    String color;

    void bark() {
        System.out.println(name + " is barking");
    }

    void walk() {
        System.out.println(name + " is walking");
    }
}

class Complex {
    int a, b;

    void display() {
        System.out.println(a + " + " + b + "i");
    }
}

//name should start with capital followed by camel case
//memory only gets allocated when objects are created
//class metadata gets loaded and is stored in metaspace
//only 1 public class inside class
//name should be same as file name
public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog(); //memory allocated in heap
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Typsy";
        d2.walk();
        d2.bark();

        Complex num = new Complex();
        num.a = 2;
        num.b = 5;
        num.display();
    }
}
