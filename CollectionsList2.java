import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ListAdditionalMethodsExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> fruits = new ArrayList<>(); // Supports all the Classes ArrayList, LinkedList and Vector.

        // ArrayList<String> fruits = new ArrayList<>();
        // LinkedList<String> fruits = new LinkedList<>();
        // Vector<String> fruits = new Vector<>();
      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Additional methods

        // addAll
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Fig");
        moreFruits.add("Grape");
        fruits.addAll(moreFruits);
        System.out.println("List after addAll: " + fruits);

        // addAll at specific index
        List<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Pineapple");
        fruits.addAll(1, tropicalFruits);
        System.out.println("List after addAll at index 1: " + fruits);

        // containsAll
        boolean containsAll = fruits.containsAll(moreFruits);
        System.out.println("Contains all elements of moreFruits: " + containsAll);

        // removeAll
        fruits.removeAll(moreFruits);
        System.out.println("List after removeAll: " + fruits);

        // retainAll
        List<String> retainFruits = new ArrayList<>();
        retainFruits.add("Apple");
        retainFruits.add("Banana");
        fruits.retainAll(retainFruits);
        System.out.println("List after retainAll: " + fruits);

        // subList
        List<String> subList = fruits.subList(0, 1);
        System.out.println("SubList from index 0 to 1: " + subList);

        // listIterator
        ListIterator<String> listIterator = fruits.listIterator();
        System.out.println("Iterating over list using list iterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // listIterator from specific index
        ListIterator<String> listIteratorFromIndex = fruits.listIterator(1);
        System.out.println("Iterating over list from index 1 using list iterator:");
        while (listIteratorFromIndex.hasNext()) {
            System.out.println(listIteratorFromIndex.next());
        }

        // replaceAll
        fruits.replaceAll(String::toUpperCase);
        System.out.println("List after replaceAll: " + fruits);

        // sort with Comparator
        fruits.sort(Comparator.naturalOrder());
        System.out.println("List after custom sort: " + fruits);
    }
}
