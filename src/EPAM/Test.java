package EPAM;

import java.util.*;
import java.util.stream.Collectors;

//AVERAGE SALARY OF EACH DEPARTMENT


//Inheritance
//Associattion
//Benefits

//Open to Extend



public class Test {
    public static void main(String[] args) {
        System.out.println(String.format("%s%s", "EXAMPLE_COMMIT_HASH", "4f9dff20-1ee6-4033-a6be-a1dc03b6dcd3"));
        /*Map<String,Integer> map=new HashMap<>();
        map.put("one", 1);
        map.put("three", 3);
        map.put("two", 2);
        List<Map.Entry<String, Integer>> x = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,
                        Collections.reverseOrder())).
                collect(Collectors.toList());
        System.out.println(x);*/
    }

}

class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int i= Double.valueOf(o1.salary).compareTo(Double.valueOf(o2.salary));
        if(i==0) {
            int j= o1.name.compareTo(o2.name);
            return j;
        }else{
            return i;
        }
    }
}
class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
//sort employee based on salary, and if salary are same then needs to be sorted based on names


    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public String getGender() {
        return gender;
    }



    public String getDepartment() {
        return department;
    }



    public int getYearOfJoining() {
        return yearOfJoining;
    }



    public double getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
                + department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
    }
}