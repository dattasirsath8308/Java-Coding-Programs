import java.util.LinkedList;

public class Get_Element_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 0; i <= 20; i++) {

            if (i % 2 == 0)
                ll.add(i);
        }

        
        System.out.println("Even No");
        ll.stream().forEach(n-> System.out.println(n) );

        Object firstEvenNumber = ll.getFirst(); // Return type of getFirst() methods is an Object.
        System.out.println("First even number: " + firstEvenNumber);

        // System.out.println("first Even no" + ll.getFirst());

        Object lastEvenNumber = ll.getLast();
        System.out.println("Last even number: " + lastEvenNumber);

        Object getElement = ll.get(5);
        System.out.println("Even number at index 5: " + getElement);

    }

}
