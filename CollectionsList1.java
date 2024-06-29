import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListMethodsExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> fruits = new ArrayList<>(); // Supporting All Classes ArrayList, LinkedList and Vector.
       
        // ArrayList<String> fruits = new ArrayList<>();
        // LinkedList<String> fruits = new LinkedList<>();
        // Vector<String> fruits = new Vector<>();
        
        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        // Adding an element at a specific index
        fruits.add(2, "Elderberry");
        System.out.println("List after adding elements: " + fruits);
        
        // Accessing elements
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
        
        // Modifying elements
        fruits.set(1, "Blueberry");
        System.out.println("List after modifying an element: " + fruits);
        
        // Removing elements by index
        fruits.remove(3);
        System.out.println("List after removing element at index 3: " + fruits);
        
        // Removing elements by value
        fruits.remove("Elderberry");
        System.out.println("List after removing 'Elderberry': " + fruits);
        
        // Checking if the list contains an element
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple);
        
        // Finding the index of an element
        int indexOfCherry = fruits.indexOf("Cherry");
        System.out.println("Index of 'Cherry': " + indexOfCherry);
        
        // Finding the last index of an element
        fruits.add("Apple");
        int lastIndexOfApple = fruits.lastIndexOf("Apple");
        System.out.println("Last index of 'Apple': " + lastIndexOfApple);
        
        // Getting the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);
        
        // Iterating over the list
        System.out.println("Iterating over the list using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Iterating over the list using iterator
        System.out.println("Iterating over the list using iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Sorting the list
        Collections.sort(fruits);
        System.out.println("List after sorting: " + fruits);
        
        // Shuffling the list
        Collections.shuffle(fruits);
        System.out.println("List after shuffling: " + fruits);
        
        // Converting the list to an array
        Object[] fruitArray = fruits.toArray();
        System.out.println("Array created from list: " + java.util.Arrays.toString(fruitArray));
        
        // Clearing the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits);
        
        // Checking if the list is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is list empty: " + isEmpty);
    }
}
