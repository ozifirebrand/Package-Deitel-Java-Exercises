package chapter16;

public class Dog implements Comparable<Dog> {
    private final int age;
    public Dog(String name, int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog anotherDog) {
        if ( age> anotherDog.age ) return 1;
        if ( age< anotherDog.age ) return -1;
        return 0;
    }
}
