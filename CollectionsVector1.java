import java.util.Vector;
import java.util.Iterator;

public class vectorExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
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
