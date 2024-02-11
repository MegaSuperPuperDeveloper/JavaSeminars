
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> list2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        System.out.println(set1);
        list1.addAll(list2);
        for (String elem : set1) {
            int count = 0;
            for (String elements : list1) {
                if (elements.equals(elem)) {
                    count++;
                }
            }
            System.out.println(elem + " = " + count);
        }
    }
}