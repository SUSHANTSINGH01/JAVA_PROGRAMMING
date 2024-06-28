import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
