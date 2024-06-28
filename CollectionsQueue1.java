import java.util.LinkedList;
import java.util.Queue;

public class TreeMapExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(); // can implement only with LinkedList, PriorityQueue and ArrayDeque. It can't implement with ArrayListector
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
