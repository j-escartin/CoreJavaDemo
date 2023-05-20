import java.util.ArrayDeque;
import java.util.Queue;

/**
 * created by James Vincent Escartin on 5/20/23
 **/
public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
