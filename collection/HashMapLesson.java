package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Apple");
        hashmap.put(2, "Orange");
        hashmap.put(3, "Banana");
        hashmap.put(null, "Kiwi");
        hashmap.put(null, "Melon");
        hashmap.put(2, "Pomegranate");

        for(Map.Entry m: hashmap.entrySet()){
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }
}
