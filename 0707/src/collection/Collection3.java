package collection;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String[] args) {
        // Map (Key, Value)
        Map<String, Integer> map  = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        for(String key:map.keySet()){
            System.out.println(map);
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
