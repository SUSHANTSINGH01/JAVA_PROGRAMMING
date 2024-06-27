import java.util.HashSet;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        System.out.println("Using for-each loop:");
        for (String element : set) {
            System.out.println(element);
        }

        System.out.println("Using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
