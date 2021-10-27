package chapter16;

public class Dog implements Comparable<Dog> {
    private final int age;
    private final String name;
    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Dog anotherDog) {
        if ( this.age> anotherDog.age ) return 1;
        if ( this.age< anotherDog.age ) return -1;
        return 0;
    }
}
