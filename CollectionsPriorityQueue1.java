import java.util.PriorityQueue;

public class TreeMapExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(); // can implement only with PriorityQueue. it can't implement with LinkedList, ArrayDeque, ArrayList
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
