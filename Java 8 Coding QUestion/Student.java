import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 40));
        students.add(new Student("Alice", 30));
        students.add(new Student("Bob", 50));
        students.add(new Student("Emma", 25));
        students.add(new Student("Mike", 60));

        // Filter students with marks greater than 35 using Java 8 Streams
        List<Student> studentsWithMarksGreaterThan35 = students.stream()
                .filter(student -> student.getMarks() > 35)
                .toList();

        studentsWithMarksGreaterThan35.forEach(student -> System.out.println(student.getName()));
    }
}
