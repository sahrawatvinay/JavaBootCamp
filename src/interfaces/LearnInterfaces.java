package interfaces;

//can not create objects
interface Animal {
    //public static final int legs = 4; //can only create these types of fields
    int legs = 4; //by default public, static, final

    void eats(); //by default public and abstract

    void drinks();

    //void fart(); // if multiple classes are implementing this interface, and lets say we add this method, then we have to

    // implement this method in all the class that are implementing this class
    default void walks() {
        System.out.println("Animals walking"); // to fix this error we can make this as default
    }
}

interface Pet {
    void sings();

    void drinks();
}

//can implement multiple interfaces but not abstract classes
class Monkey implements Animal, Pet {
    public void eats() {
        System.out.println("Monkey EATS");
    }

    public void sings() {
        System.out.println("Monkey SINGS");
    }

    //multiple inheritance supported here, no matter there are 2 methods we just need to implement one
    public void drinks() {
        System.out.println("Monkey DRINKS");
    }
}

public class LearnInterfaces {
    public static void main(String[] args) {
        Monkey mnk = new Monkey();
        mnk.eats();
        mnk.drinks();
        mnk.sings();
    }
}
