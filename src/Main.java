import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        int i = 300;
//        int j = 300;
//
//        Integer ii = i;
//        Integer jj = j;
//
//        System.out.println(ii.compareTo(jj));
//
//        String str1 = "hello";
//        String str2 = "helloaaakjhbgvjhvbjhvb";
//
//        System.out.println(str1.compareTo(str2));

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "a");
//        map.put(2, "b");
//        map.put(3, "c");
//        map.put(4, "d");
//        map.put(5, "e");
//
//        System.out.println(map.putIfAbsent(6, "f"));

//        Comparator<Integer> INT_COMP = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return  Integer.compare(o2, o1);
//            }
//        };
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(5);
//        list2.add(9);
//        list2.add(3);
//        list2.add(7);
//        list2.add(11);
//
//        list2.sort(INT_COMP);
//
//        for (Integer el: list2) {
//            System.out.println(el);
//        }

        Comparator<String> COMP_STR;
        List<String> list2 = new ArrayList<>();
        COMP_STR = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1.compareTo(o2));
                return o1.compareTo(o2);
            }
        };
        list2.add("b");
        list2.add("a");
        list2.add("e");
        list2.add("c");
        list2.add("f");
        list2.add("d");

        list2.sort(COMP_STR);

        for (String el: list2) {
            System.out.println(el);
        }
//
//        Collections.copy(list2, list);
//
//        for (String el: list2) {
//            System.out.println(el);
//        }
    }
}
