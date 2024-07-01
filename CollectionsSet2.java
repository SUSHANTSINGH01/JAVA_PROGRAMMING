import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Spliterator;

public class ExtendedSetMethodsExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // LinkedHashSet<String> set = new LinkedHashSet<>();
        // TreeSet<String> set = new TreeSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
       

        // Add elements again
        set.add("Apple");
        set.add("Avocado");
        set.add("Banana");
        set.add("Apricot");
        
         System.out.println("Set: " + set);

        // Remove elements that start with 'A'
        set.removeIf(s -> s.startsWith("A"));
        System.out.println("After removeIf: " + set);

        // forEach method
        set.forEach(System.out::println);

        // Create a Spliterator
        Spliterator<String> spliterator = set.spliterator();
        System.out.println("Using Spliterator:");
        spliterator.forEachRemaining(System.out::println);
    }
}
