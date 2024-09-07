package innerClass;

/*
non static nested class is a class within another class.
since inner class exists with the outer claSS, you must instanciate the outer class first, in order to instanciate inner class
static nested class can not access the member variable of the outer class.
because the static nested class doesn't require you to create an instance of the outer class
using nested class makes your code  more readable and provide better encapsulation.
 */
public class LearnInnerClass {
    class Toy {
        int price;
    }
    static class Playstation {
        int price;
    }

    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 50;

        Playstation ps = new LearnInnerClass.Playstation();
    }
}
