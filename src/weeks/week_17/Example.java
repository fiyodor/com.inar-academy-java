package weeks.week_17;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        FindMin.addRandomNumbers(list, 10);

        System.out.println(list.toString());

        printUniqueValues(list);


    }

    public static void printUniqueValues(List<Integer> list){

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < list.size(); i++) {

            set.add(list.get(i));
        }
        set.addAll(list);

        System.out.println(Arrays.toString(set.toArray()));

       // System.out.println(set.toString());
    }
}
