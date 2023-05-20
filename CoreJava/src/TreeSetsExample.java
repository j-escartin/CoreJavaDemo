import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * created by James Vincent Escartin on 5/20/23
 **/
public class TreeSetsExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(15);
        System.out.println(treeSet);

        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String :: length));
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);
        wordSet.add("wolf");
        System.out.println(wordSet);
        wordSet.remove("giraffe");
        System.out.println(wordSet);
    }
}
