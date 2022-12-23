package practice;

import practice.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeImpl {
    public static void main(String[] args) {

        List<Employee> employees = Arrays
                .asList(new Employee(1,"abc", "IT")
                        , new Employee(2,"bcd", "IT")
                        , new Employee(3,"efg", "IT")
                );

        employees
                .stream()
                .filter(employee -> employee.getName().startsWith("a"))
                .forEach(employee -> System.out.print(employee.toString()));

    }
}
