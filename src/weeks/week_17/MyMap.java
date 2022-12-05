package weeks.week_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 48);
        map.put(1, 58);
        map.put(2, 76);
        map.put(10, 48);
        map.put(10, 3);
        map.put(11, 48);

        print(map);
    }
    public static void print(Map map){

        Set<Integer> set = map.keySet();

        for(Integer key: set) {

            System.out.print(map.get(key) + " ");
        }
    }
}
