import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/*  

Java provides two interfaces to sort objects using data members of the class: 

	1. Comparable 
	2. Comparator

		1. Comparable provide a single sorting sequence. In other word, can sort the collection on the basis of single element such as id, name and price.
		1. Comparator provide multiple sorting sequences. In other word can sort the collection on the basis of multiple element such as id, name and price.

		2. Comparable affects the original class. that is the actual class is modified. 
		2. Comparator doesn't affect the original class that is actual class is not modified.

		3. Comparable provides compareTo() method to sort element.
		3. Comparator provide compare() method to sort elements.
		
		4. Comparable is present in java.lang package.
		4. A comparator is present in java.util package.
		
		5. We can sort the list element of Comparable type by Collections.sort(List) method.
		5. We can sort the list elements of Comparator type Collections.sort(List, Comparator) method.

*/


class Student  implements Comparable<Student>
{

    private int id;
    private String name ;


    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Student s) {

        if(id == s.id)
        {
            return 0;
        }else if(id > s.id)
        {
            return 1;
        }else
        {
            return -1;
        }
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "student id :"+id +", name :"+name; 
    }


}


public class Comparable_ {

    public static void main(String[] args) {
        

        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1, "Datta");
        Student s2 = new Student(22, "Nagesh");
        Student s3 = new Student(13, "Mac");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);

        System.out.println(list);
        
    }
    
}
