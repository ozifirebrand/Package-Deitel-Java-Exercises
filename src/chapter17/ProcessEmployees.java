package chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        Predicate<Employee> fourToSixThousand = e->(e.getSalary()>= 4000 && e.getSalary() <= 6000);

        System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary: %n");
        list.stream().filter(fourToSixThousand).sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("%nFirst employee who earns in the range $4000-$6000: %n%s%n",
                list.stream().filter(fourToSixThousand).findFirst().get());


        System.out.println();
        System.out.println();
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName)
                .thenComparing(byFirstName);

        System.out.printf("%nEmployees in ascending order by last name then first: %n");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);

        System.out.printf("%nEmployees in descending order by last name then first:%n");
        list.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);

        System.out.printf("%nUnique employee last name:%n");
        list.stream().map(Employee::getLastName).distinct().sorted()
                .forEach(System.out::println);

        System.out.printf("%nEmployee names in order by last name then first name");
        list.stream().sorted(lastThenFirst).map(Employee::getName)
                .forEach(System.out::println);

        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment =
                list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((department, employeesInDepartment)->{
            System.out.println();
            System.out.println(department);
            employeesInDepartment.forEach(
                    employee -> System.out.printf("  %s%n", employee)
            );
        });

        System.out.printf("%nCount of Employees by department:%n");
        Map<String, Long> employeeCountByDepartment =
                list.stream().collect(Collectors.groupingBy
                        (Employee::getDepartment, Collectors.counting()));

        employeeCountByDepartment.forEach((department, count)->{
                System.out.println();
        System.out.printf("%s has %d employee(s)%n", department,count);});


    }
}
