package oops;

/*
 * constructors are invoked implicitly when we instanciate objects.
 * name should be same as class name.
 * does not have a return time.
 * if there is no const, java creates one for us and initialize values with default values.
 * constructor can not be abstract, final or static.
 * constructor can be overloaded but not overriden.
 * */
class ComplexNumber {
    int a, b;

    //if we don't create this, java automatically creates one
//    public ComplexNumber() {
//        a = 0;
//        b = 0;
//    }

    //parameterised constructor
    //this keyword referes to the current object inside a method or constructor.
    //used to remove ambiguity
    //can be used to invoke methods of current class or invoke constructor of current class
    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + "+ i" + b);
    }
}

public class LearningConstructors {
    public static void main(String[] args) {
        //if there is one parameterised constructor and no default constructor.
        //then you have to create new instances using def const only.
        //there will be error if we create like below.
        //if we need to remove this error we need to create default constructor to remove error. commented above at the moment.
        //ComplexNumber num = new ComplexNumber();
        ComplexNumber num1 = new ComplexNumber(2, 5);
        //num.print();
        num1.print();
    }
}
