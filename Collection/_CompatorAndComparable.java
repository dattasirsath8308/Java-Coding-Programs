import java.util.Comparator;
import java.util.TreeSet;


/* 
 

	Comparable Vs Comparator
	- For predefined Comparable classes default Natural Sorting Order is already available if we are not Satisfied with that we can define our Own Customized Sorting By using Comparator. Ex : String.
	- For predefined Non-Comparable Classes Default Natural Sorting Order is Not Available is not Compulsory We Should define Sorting By Using Comparator. Ex : StringBuffer 
	- For Our own Customized classes to define Natural Sorting order we can go for Comparable & to Define Customized Sorting We should go for Comparator. Ex : Employee, Student, Customer.

    

 */
class Employee implements Comparable
{

    int eid;

    public Employee(int eid)
    {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "E Id : "+ eid;
    }

    @Override
    public int compareTo(Object o) {
        int eid1 = this.eid;

        Employee e2 = (Employee) o;
        int eid2 = e2.eid;

        if(eid1 < eid2)
        {
            return -1;
        }else if(eid1 > eid2)
        {
            return +1;
        }else
        {
            return 0;
        }

    }
}


class MyComparator implements Comparator
{
  
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 =(Employee) o1;
        Employee e2 =(Employee) o2;
        
        return e2.compareTo(e1);
    }
}

public class _CompatorAndComparable {

    public static void main(String[] args) {
        
        
        Employee e1 = new Employee(200);
        Employee e2 = new Employee(100);
        Employee e3 = new Employee(500);
        Employee e4 = new Employee(500);
        Employee e5 = new Employee(700);

        TreeSet<Object> t = new TreeSet<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        System.out.println(t);



        // Comparator

        TreeSet<Object> t2 =  new TreeSet<>(new MyComparator());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2);

    }
    
}
