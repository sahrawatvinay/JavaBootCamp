package anonymous;

/*
 * we can create nested class without giving any name.
 * a nested class that does not have any name is called anonymous class.
 * anonymous class usually extend subclasses or implement interfaces.
 * Here type can be:
 * 1. a subclass that an anonymous class extends
 * 2. an interface that an anonymous class implements
 * */
public class LearnAnonymous {
    //anonymous class, child class of outer class
    OuterClass obj = new OuterClass() {
        void sing() {

        }

        public void OuterMethod() {

        }
    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };
}

class OuterClass {
    public void outerMethod() {

    }
}

interface SuperInterface {
    void interfaceMethod();
}
