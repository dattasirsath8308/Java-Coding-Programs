import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int marks;

    public Student(String name, int marks)
    {
        this.name = name;
        this.marks =marks;
    }


    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    

    public static void main(String[] args) {


       List<Student> s = new ArrayList<>(); 
       
       s.add(new Student("Datta", 50));
       s.add(new Student("Nagesh", 20));
       s.add(new Student("Rohit", 40));
       s.add(new Student("Virat", 10));


       s.stream().filter( e -> e.getMarks() > 35 ).forEach( s1 ->  System.out.println(s1.getName()));

    }
    
}
