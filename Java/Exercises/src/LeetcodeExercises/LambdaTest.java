package LeetcodeExercises;

import java.util.*;

public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Random().nextInt());
        }
        //匿名内部类
        list.sort(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                }

        );
        list.sort((o1, o2) -> o2 - o1);
    }

}
