package LeetcodeExercises;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add("elephant"+i);
        }
        set.forEach(s-> System.out.println(s));
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set1.add("slimphant"+i);
        }
        set1.forEach(s -> System.out.println(s));
    }
}
