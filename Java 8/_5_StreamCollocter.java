import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class _5_StreamCollocter {

    public static void main(String[] args) {

        groupingBy();

        System.out.println("\n--------------------------\n");

        fetchDataList();

    }

    // 1. Java – Stream Collectors groupingBy and counting Example

    public static void groupingBy() {
        System.out.println("Stream Collectors groupingBy and counting : ");
        List<String> names = Arrays.asList("Jon", "Ajeet", "Steve",
                "Ajeet", "Jon", "Ajeet");

        Map<String, Long> map = names.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        System.out.println(map);
    }

    // 2. Stream Collectors example of fetching data as List
    public static void fetchDataList() {
        List<Student> studentlist = new ArrayList<Student>();
        // Adding Students
        studentlist.add(new Student(11, "Jon", 22));
        studentlist.add(new Student(22, "Steve", 18));
        studentlist.add(new Student(33, "Lucy", 22));
        studentlist.add(new Student(44, "Sansa", 23));
        studentlist.add(new Student(55, "Maggie", 18));
        // Fetching student names as List
        List<String> names = studentlist.stream()
                .map(n -> n.name)
                .collect(Collectors.toList());
        System.out.println("Name of Student :" + names);

        List<Integer> ages = studentlist.stream()
                .map(a -> a.age)
                .collect(Collectors.toList());
        System.out.println("Ages of Student :" + ages);

        // Collecting Data as Set replacement List as Set in like above example
        for (Student stu : studentlist) {
            System.out.println("List of Student :\n" + stu.id + " " + stu.name + " " + stu.age);
        }



        // Getting the average Age
        Double avgAge = studentlist.stream()
                .collect(Collectors.averagingInt(s -> s.age));
        System.out.println("Average Age of Students is: " + avgAge);
    
    }

}
