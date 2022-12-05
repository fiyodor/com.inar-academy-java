package weeks.week_17;

import java.util.ArrayList;
import java.util.List;

public class FindMin {

    public static void main(String[] args) {

        List<Integer> random100 = new ArrayList<>();

        addRandomNumbers(random100, 10);

        int min = findMin(random100);

        System.out.println(random100.toString());

        System.out.println(min);

        System.out.println("Index of min is " + findIndexOfMin(random100));
    }

    public static void addRandomNumbers(List list, int i){

        for(int j = 0; j < i; j++) {

            list.add((int) (Math.random() * 10));
        }
    }
    public static Integer findMin(List list){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list.size(); i++) {

            if(min > (int)list.get(i)){

                min = (int)list.get(i);
            }
        }
        return min;
    }
    public static Integer findIndexOfMin(List list){

        int minIndex = -1;

        for(int i = 0; i < list.size(); i++) {

            if(findMin(list) == (int)list.get(i)){

                minIndex = i;
            }
        }
        return minIndex;
    }


}
