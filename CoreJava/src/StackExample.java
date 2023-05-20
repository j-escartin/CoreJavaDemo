import java.util.ArrayDeque;
import java.util.Deque;

/**
 * created by James Vincent Escartin on 4/20/23
 **/
public class StackExample {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("second");
        stack.push("third");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
