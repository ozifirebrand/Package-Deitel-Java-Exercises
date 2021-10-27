package chapter16;

import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Aja", 23);
        Dog dog2 = new Dog("Ewa", 13);
        Dog dog3 = new Dog("Zinga", 18);
        List<Dog> dogs = Arrays.asList(dog1, dog2, dog3);
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);

        Map<String, Dog> dogMap = new HashMap<>();
        dogMap.put("Zinga", dog3);
        dogMap.put("Ewa", dog2);
        dogMap.put("Aja", dog1);
        Set<String> keys = dogMap.keySet();
        if ( dogMap.containsKey("Ewa") ) System.out.println(dogMap.get("Ewa"));
    }
}
