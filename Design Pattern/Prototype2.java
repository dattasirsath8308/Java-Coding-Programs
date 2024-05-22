
// Prototype class
class Prototype implements Cloneable {
    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            // Handle exception if clone is not supported
            return null;
        }
    }
}

// Main class to demonstrate Prototype pattern
public class Prototype2 {
    public static void main(String[] args) {
        // Creating prototype
        Prototype original = new Prototype("Original Prototype");

        // Cloning prototype
        Prototype copy = original.clone();

        // Modifying copy
        copy.setName("Modified Prototype");

        // Printing original and copy names
        System.out.println("Original Prototype: " + original.getName());
        System.out.println("Copied Prototype: " + copy.getName());
    }
}
