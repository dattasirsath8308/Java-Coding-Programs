import java.util.ArrayList;
import java.util.List;

//  Java Lambda Expression without Parameters
@FunctionalInterface
interface MyFunctionalInterface
{

    // without paramtr
    public String sayHello();
}


//  Java Lambda Expression with Single Parameters
@FunctionalInterface
interface MyFunctionalInterfaceWithPara
{

    // without paramtr
    public int square(int a);
}

// Java Lambda Expression with Multiple Parameters


@FunctionalInterface
interface MyFunctionalInterfaceWith_MultiPara
{

    // without paramtr
    public int Addtion(int a, int b);
}



interface  evenNumber
{
    public  void even(int a[]);

}

 class Lambda_WihtoutParameter
{
    public static void main(String[] args) {
        
        MyFunctionalInterface msg = () -> { 
            return "Hello";
        };
        System.out.println(msg.sayHello());

        System.out.println("----------------------------");


        MyFunctionalInterfaceWithPara sq = (a) -> { return a*a ;};
        System.out.println( sq.square(5));

        System.out.println("----------------------------");

        MyFunctionalInterfaceWith_MultiPara add = (a,b) -> a+b ;
        System.out.println("Addtion of Multiple para is :"+add.Addtion(10, 20));


        System.out.println("----------------------------");

        // 4. 
        System.out.println("Iterating collections using foreach loop");

        List<String> l = new ArrayList<>();
        l.add("datta");
        l.add("Kailas");
        l.add("sirsath");
        l.add("from Pimpri");

        // lambda expression
        l.forEach( e -> System.out.print(e +" "));



    }
}