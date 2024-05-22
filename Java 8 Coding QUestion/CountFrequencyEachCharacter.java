import java.lang.reflect.Constructor;
import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.smartcardio.CommandAPDU;
import javax.swing.text.Highlighter;

// 14. Write a Program (WAP) using stream to find frequency of each character in a given string ?
// 15.  Assume you have list of employee in various dept, WAP to find highest paid employye from each dept.

class Employee {
    String name;
    String dept;
    int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name : " + name + " , dept : " + dept + " ,salary " + salary;
    }
}

public class CountFrequencyEachCharacter {

    public static void main(String[] args) {

        countFrequency();

        highestSalary();

        SeqAndParallelStream();

    }

    static void countFrequency() {
        String str = "Datta";

        // str.chars()
        // .mapToObj(c ->(char) c) // Convert the String to an IntStream
        // .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Group by
        // character and count them
        // .forEach((Character,frequency) -> System.out.println("Character :"+ Character
        // +" - Frequency : "+frequency ));

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((c, f) -> System.out.println(c + " is no of time: " + f));
    }

    static void highestSalary() {
        List<Employee> empList = Stream.of(

                new Employee("Datta", "IT", 8000),
                new Employee("Nagesh", "Finance", 24000),
                new Employee("Robot", "Finance", 21000),
                new Employee("Ravi", "IT", 8000),
                new Employee("Pavan", "Construct", 30000),
                new Employee("Babu Bhaiyya", "Construct", 25000),
                new Employee("Vishal", "IT", 10000)

        ).collect(Collectors.toList());

        // Comparator<Employee> highSalary = Comparator.comparing(Employee::getSalary);
        // Map<String, Optional<Employee>> empMap = empList.stream()
        // .collect(Collectors
        // .groupingBy(Employee::getDept,
        // Collectors.reducing(BinaryOperator.maxBy(highSalary))
        // )
        // );

        // Approach 1
        Comparator<Employee> highsa = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> empMap = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.reducing(BinaryOperator.maxBy(highsa))));

        System.out.println(empMap);

        // Approach 2

        Map<String, Employee> empMap2 = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get)));

        System.out.println(empMap2);

    }



    static void SeqAndParallelStream()
    {

        System.out.println("Sequencial use only Sigle COre of System");
        IntStream.range(1, 10).forEach(i -> System.out.println("Sequencial Stream : "+Thread.currentThread().getName()+i));


        System.out.println("\n========\n");

        System.out.println("Parallel stream use Multiple  COre of System");
        IntStream.range(1, 10).parallel().forEach(i -> System.out.println("Parallel Stream : "+Thread.currentThread().getName()+i));

    }

}
