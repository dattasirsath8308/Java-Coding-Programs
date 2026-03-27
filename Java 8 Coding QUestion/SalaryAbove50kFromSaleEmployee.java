import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.html.Option;

class Employee {
    private int salary;
    private String department;
    private String name;

    public Employee(int salary, String name, String department) {
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name "+ name +" , Department : "+ department +" , salary : "+ salary;
    }


    public static void reverseString()
    {

        String str = "Datta ";

        // char []ch = str.toCharArray();
        // String rev = " ";
        // for (int i = 0; i < ch.length; i++) {
        //     rev =  ch[i] + rev; 
        // }

        StringBuffer sb = new StringBuffer();

        for (int i = str.length() -1  ; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }

        String rev = sb.toString();
        
        System.out.println(rev);
        
    }

}

public class SalaryAbove50kFromSaleEmployee {

    public static void main(String[] args) {


        Employee.reverseString();

        System.out.println("\n-------------------------\n");

        List<Employee> empList = Arrays.asList( 

         new Employee(90000, "Datta", "IT"),
         new Employee(70000, "Nagesh", "Sale"),
         new Employee(10000, "ABC", "Sale"),
         new Employee(54000, "Datta", "Sale"),
         new Employee(50000, "Datta", "IT")

        
        );


        // Employee from Sale Department whose salary > 50000

        List<String> result = empList.stream().filter(e -> e.getDepartment().equals("Sale") && e.getSalary() > 50000).map(Employee::getName).toList();

        System.out.println(result);


        // // Emplyee Who has highest salary

        Optional<Employee> highSalarEmployee  = empList.stream().max(Comparator.comparingInt(Employee::getSalary));

        highSalarEmployee.ifPresent(e -> System.out.println(" Name "+e.getName() +" and Salary "+ e.getSalary() ));





        
    }



    

}
