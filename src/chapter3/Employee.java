package chapter3;

public class Employee {

    Employee(){

    }
    Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary= salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        String firstName;
        String lastName;
        double salary;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public double tenPercentRaise(){
        salary = salary + salary * 0.01;
        return salary;
    }

    public void setSalary(double salary) {
        if ( salary>= 0 ){
        this.salary = salary;}
    }

    public double oneYearSalary(){
        salary = salary * 12;
        return  salary;
    }

    public double oneYearSalaryAfterRaise(){
    double newSalary = tenPercentRaise();
    salary = newSalary*12;
    return salary;
    }


}