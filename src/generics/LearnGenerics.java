package generics;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("1234", "Sammy");
        Dog<Integer, Integer> d2 = new Dog<>(12, 22);
        Integer str = d2.getId();
        System.out.println(d1 + " " + str);
    }
}

class Dog<E, V> {
    E id;
    V name;

    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }

    E getId() {
        return id;
    }
}
