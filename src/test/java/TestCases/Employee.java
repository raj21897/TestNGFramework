package TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    int id ;
    String name;
    int salary;

    Employee(int id, String name , int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"Rajesh",10000));
        empList.add(new Employee(2,"Mahadev",20000));
        empList.add(new Employee(3,"Choudhari",25000));

//        empList.stream().filter(s -> s.salary>20000).forEach(p -> System.out.println(p.name));
//        empList.stream().filter(s -> s.salary>20000).forEach(p -> System.out.println(p.salary));

        List<Employee> empList2 = Arrays.asList(
                new Employee(1, "Rajesh", 10000),
                new Employee(2,"Mahadev",20000),
                new Employee(3,"Choudhari",25000));

      List<Integer> salry =  empList2.stream().map(n -> n.salary+1000).collect(Collectors.toList());
        System.out.println(salry);
        System.out.println(empList2.toString());

    }
}
