package LeetcodeExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add("elephant" + i);
        }
        Iterator<String> it = list.iterator();
        //普通迭代器遍历
//        while (it.hasNext()){
//            if("elephant1".equals(it.next())){
//                it.remove();
//            }
//        }
        //列表迭代器
//        ListIterator<String> listIt = list.listIterator();
//        while (listIt.hasNext()){
//            if("elephant1".equals(listIt.next()))
//                listIt.add("elephant3");
//        }
        //
        list.forEach(s -> System.out.println(s));
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
