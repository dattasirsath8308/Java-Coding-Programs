
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEX {

    public static void main(String[] args) {
        // Create a new ConcurrentHashMap
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        // Put some key-value pairs
        concurrentHashMap.put(1, "One");
        concurrentHashMap.put(2, "Two");
        concurrentHashMap.put(3, "Three");

        // Print the ConcurrentHashMap
        System.out.println("Initial ConcurrentHashMap: " + concurrentHashMap);

        // Update a value
        concurrentHashMap.put(2, "Updated Two");

        // Print the updated ConcurrentHashMap
        System.out.println("Updated ConcurrentHashMap: " + concurrentHashMap);

        // Remove a key-value pair
        concurrentHashMap.remove(3);

        // Print the ConcurrentHashMap after removal
        System.out.println("ConcurrentHashMap after removal: " + concurrentHashMap);

        // Check if a key exists
        int keyToCheck = 2;
        if (concurrentHashMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the ConcurrentHashMap.");
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the ConcurrentHashMap.");
        }

        // Check if a value exists
        String valueToCheck = "One";
        if (concurrentHashMap.containsValue(valueToCheck)) {
            System.out.println("Value \"" + valueToCheck + "\" exists in the ConcurrentHashMap.");
        } else {
            System.out.println("Value \"" + valueToCheck + "\" does not exist in the ConcurrentHashMap.");
        }

        // Clear the ConcurrentHashMap
        concurrentHashMap.clear();

        // Print the ConcurrentHashMap after clearing
        System.out.println("ConcurrentHashMap after clearing: " + concurrentHashMap);
    }
}
