import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * created by Acer on 5/20/23
 **/
public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> studentNames = new LinkedList<>();
        studentNames.add("James");
        studentNames.add("John");
        studentNames.add("Wayne");

        System.out.println(studentNames);

        studentNames.add(1, "Royce");
        System.out.println(studentNames);

        studentNames.removeFirst();
        System.out.println(studentNames);

        List<String> synchronizedNames = Collections.synchronizedList(studentNames);
        System.out.println(synchronizedNames);
    }
}
