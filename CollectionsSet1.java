import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class SetMethodsExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //LinkedHashSet<String> set = new LinkedHashSet<>();
        //TreeSet<String> set = new TreeSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set: " + set);

        // Add all elements from a collection
        set.addAll(Arrays.asList("Date", "Elderberry"));
        System.out.println("After addAll: " + set);

        // Contains element
        System.out.println("Contains 'Apple': " + set.contains("Apple"));

        // Remove element
        set.remove("Banana");
        System.out.println("After remove 'Banana': " + set);

        // Size of set
        System.out.println("Size: " + set.size());

        // Is set empty
        System.out.println("Is empty: " + set.isEmpty());

        // Iterate over set
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterating over set:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Convert to array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Clear set
        set.clear();
        System.out.println("After clear: " + set);
    }
}
