package chapter17;

import java.util.Arrays;
import java.util.List;

public class ProcessEmployees {
    public static void main(String[] args) {
        Employee [] employees = {
                new Employee("Toye", "Pupa", 5000, "IT"),
                new Employee("Dami", "Funfun", 7600, "IT"),
                new Employee("Amarachi", "Asa", 3587.5, "Sales"),
                new Employee("Yetunde", "Shokole", 4700.77, "Marketing"),
                new Employee("Cubana", "Olowo", 6200, "IT"),
                new Employee("Toska", "Boye", 3200, "Sales"),
                new Employee("Ozioma", "Jaiye", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);

    }


}
