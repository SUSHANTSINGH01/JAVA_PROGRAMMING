import java.util.LinkedHashSet;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
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
