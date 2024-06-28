import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
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
