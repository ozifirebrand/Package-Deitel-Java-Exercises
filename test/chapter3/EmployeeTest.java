package chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee newEmployee = new Employee("Jide",
            "Amusan", 50000.00);

    @Test
    public void testThatFirstName() {
        Assertions.assertEquals("Jide", newEmployee.getFirstName());
    }

    public void testLastName() {
        Assertions.assertEquals("Amusan",newEmployee.getLastName());
    }

    public void testSalary(){
        Assertions.assertEquals(50000,newEmployee.getSalary());
    }

    @Test
    public void  testThatSalaryIsNotNegative(){
        Employee newEmployee = new Employee();
        newEmployee.setSalary(-5000.0);
        Assertions.assertEquals(0,newEmployee.getSalary());
    }

    @Test
    public void test10PercentRaise(){
        newEmployee.oneYearSalary();
        Assertions.assertEquals(606000, newEmployee.getSalary());
    }
}