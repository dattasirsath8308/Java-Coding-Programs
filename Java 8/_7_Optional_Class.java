import java.util.Optional;

/* 

- In Java 8, we have a newly introduced Optional class in java.util package. 
- This class is introduced to avoid NullPointerException that we frequently encounters if we do not perform null checks in our code.
- Using this class we can easily check whether a variable has null value or not and by doing this we can avoid the NullPointerException.
- In this guide, we will see how to work with Optional class and the usage of various methods of this class.

*/

public class _7_Optional_Class {

    public static void main(String[] args) {

        // Without_Optional();

        UsingOptional();

        System.out.println("\n-------------------------\n");
        is_if_PresentMethod();

        System.out.println("\n-------------------------\n");

        orElse_GetMethod();

        System.out.println("\n-------------------------\n");
        map_flatmap();

    }

    static void Without_Optional() {
        String[] str = new String[10];
        // Getting the substring
        String str2 = str[9].substring(2, 5);
        // Displaying substring
        System.out.print(str2);
    }

    // Optional.ofNullable() method of the Optional class, returns a Non-empty
    // Optional if the given object has a value, otherwise it returns an empty
    // Optional.
    // We can check whether the returned Optional value is empty or non-empty using
    // the isPresent() method.

    static void UsingOptional() {
        String[] str = new String[10];
        Optional<String> isNull = Optional.ofNullable(str[9]);
        if (isNull.isPresent()) {
            // Getting the substring
            String str2 = str[9].substring(2, 5);
            // Displaying substring
            System.out.print("Substring is: " + str2);
        } else {
            System.out.println("Cannot get the substring from an empty string");
        }
        str[9] = "AgraIsCool";
        Optional<String> isNull2 = Optional.ofNullable(str[9]);
        if (isNull2.isPresent()) {
            // Getting the substring
            String str2 = str[9].substring(2, 5);
            // Displaying substring
            System.out.print("Substring is: " + str2);
        } else {
            System.out.println("Cannot get the substring from an empty string");
        }
    }

    // using isPresent() method we can check whether the particular Optional
    // object(or instance) is empty or no-empty.
    // There is another method present in the Optional class, which only executes if
    // the given Optional object is non-empty, the method is ifPresent().

    static void is_if_PresentMethod() {
        // Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");

        // Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        // isPresent() method: Checks whether the given Optional Object is empty or not.
        if (GOT.isPresent()) {
            System.out.println("Watching Game of Thrones");
        } else {
            System.out.println("I am getting Bored");
        }

        // ifPresent() method: It executes only if the given Optional object is
        // non-empty.
        // This will print as the GOT is non-empty
        GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));

        // This will not print as the nothing is empty
        nothing.ifPresent(s -> System.out.println("I prefer getting bored"));

    }

    // These two methods orElse() and orElseGet() returns the value of Optional
    // Object if it is no empty, if the object is empty then it returns the default
    // value passed to this method as an argument.
    static void orElse_GetMethod() {
        // Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");

        // Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        // orElse() method
        System.out.println(GOT.orElse("Default Value GOT"));
        System.out.println(nothing.orElse("Default Value Empty NOthing"));

        // orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value Get"));
        System.out.println(nothing.orElseGet(() -> "Default Value Nothing Get "));
    }

    static void map_flatmap() {

        // Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");

        // Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        System.out.println(GOT.map(String::toLowerCase));
        System.out.println(nothing.map(String::toLowerCase));
        
        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));
        System.out.println("Value of Optional object" + anotherOptional);
        System.out.println("Optional.map: "
                + anotherOptional.map(gender -> gender.map(String::toUpperCase)));
        // Optional<Optional<String>> -> flatMap -> Optional<String>
        System.out.println("Optional.flatMap: "
                + anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));

    }

}
