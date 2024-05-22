import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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


class Movie  
{
    private int id;
    private String name ;

    public Movie(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return  "Movie : Id- "+id + " Name- "+name;
    }
}

class idComparator implements Comparator<Movie>
{

    @Override
    public int compare(Movie m1, Movie m2) {
       
        if(m1.getId() == m2.getId())
        {
            return 0;
            //  if both id m1 & m2  are same then we can go with name we comparet the name  
            // return m1.getName().compareTo(m2.getName());
        } else if(m1.getId() > m2.getId())
        {
            return 1;
        }else{
            return -1;
        }
    }

}


class NameComparator implements Comparator<Movie>
{

    @Override
    public int compare(Movie m1, Movie m2) {

        return m1.getName().compareTo(m2.getName()) ;
    }




}


public class Comparator_ {

    public static void main(String[] args) {
        

        List<Movie> mList = new ArrayList<>();
        Movie m1 = new Movie(11, "Sholey");
        Movie m2 = new Movie(51, "Khatta Mitha");
        Movie m3 = new Movie(21, "Duniyadari");
        
        mList.add(m1);
        mList.add(m2);
        mList.add(m3);
        
        // Collections.sort(mList,new idComparator());

        Collections.sort(mList,new NameComparator());

        System.out.println(mList);

    }
}
