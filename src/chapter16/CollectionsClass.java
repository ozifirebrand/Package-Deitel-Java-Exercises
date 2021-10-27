package chapter16;

import java.util.ArrayList;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Aja", 23);
        Dog dog2 = new Dog("Ewa", 13);
        Dog dog3 = new Dog("Zinga", 18);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dog1.compareTo(dog3));
    }
}
