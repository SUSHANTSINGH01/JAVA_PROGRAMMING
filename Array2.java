import java.util.Arrays;

public class Main {

  public static void main(String[] args){
    System.out.println("Hello from New Class");
    
        int[] array = {5, 2, 8, 4, 1};

        // Copying arrays
        int[] copiedArray = Arrays.copyOf(array, array.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Sorting arrays
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Searching in arrays (binary search requires sorted array)
        int index = Arrays.binarySearch(array, 4);
        System.out.println("Index of element 4: " + index);

        // Filling arrays
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
    
  }

}
