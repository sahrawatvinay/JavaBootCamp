package polymorphism;

/*
*  allows us to perform single action in different ways.
* allows us to define 1 interface and have multiple implementations
* word poly means many and morphs means forms
* 2 types
* run time : overriding, inheritance
* compile time : overloading
* */

class Data {
    int data;

    public void printData() {
        System.out.println(data);
    }

    public void printData(int ctr) {
        for (int i = 0; i < ctr; i++) {
            System.out.println(data);
        }
    }
}

class ChildData extends Data {
    @Override
    public void printData() { //compile time polymorphism
        System.out.println("overridden" + data);
    }
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        Data d = new ChildData(); //run time polymorphism aka method overriding, only access parents method
        Data d2 = new Data();
        d2.printData(5); //linking done here only
    }
}
