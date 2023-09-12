package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByTest {
    public static void main(String[] args) {
        Employee e1= new Employee(1, 20, "Sagar");
        Employee e2= new Employee(2, 25, "Seshu");
        Employee e3= new Employee(3, 28, "Ram");
        Employee e4= new Employee(4, 30, "Rajesh");
        Employee e5= new Employee(5, 25, "Thejesh");
        Employee e6= new Employee(6, 28, "Ram");
        Employee e7= new Employee(7, 20, "Lakshmi");

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1); employeeList.add(e2);
        employeeList.add(e3); employeeList.add(e4);
        employeeList.add(e5); employeeList.add(e6);employeeList.add(e7);
        Map<Integer, Set<Employee>> em = employeeList.stream().collect
                (Collectors.groupingBy(employee -> employee.age,TreeMap::new,
                        Collectors.toSet()));
        for ( Integer e:em.keySet()) {
          Collection<Employee> coll = em.get(e);
            for (Employee emp:coll) {
               System.out.println(emp);
            }
        }


    }
}

class Employee{
    int id;
    int age;
    String customerName;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public Employee(int id, int age, String customerName) {
        this.id = id;
        this.age = age;
        this.customerName = customerName;
    }
}
