package oops;

/*
* method with same name but different params
* different number of arguments
* ---or---
* different type of arguments
* different return type cant determine overloading
* */
class Greet {
    void greetings() {
        System.out.println("Good Morning !");
    }

    //won't overload as it does not depend on the runtime
//    int greetings(){
//        return 0;
//    }

    void greetings(String name) {
        System.out.println("Hello" + name + ", Good Morning !");
    }

    void greetings(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello" + name + ", Good Morning !");
        }
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Greet gg = new Greet();
        gg.greetings();
        gg.greetings("Vinay");
        gg.greetings("Vinay", 3);
    }
}
