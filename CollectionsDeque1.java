import java.util.ArrayDeque;
import java.util.Deque;

public class TreeMapExample {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();  // can implement only with ArrayDeque and LinkedList.
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
