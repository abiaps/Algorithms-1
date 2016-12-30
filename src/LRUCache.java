import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by abiaps on 12/27/2016.
 */
public class LRUCache {

    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
    int cap = 0;

    public LRUCache(int capacity) {
        cap = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.get(key);
            cache.remove(key);
            cache.put(key, value);
            return value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            cache.put(key, value);
        } else if (cache.size() == cap) cache.remove(cache.entrySet().iterator().next().getKey());
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lr = new LRUCache(3);
        lr.set(1, 1);
        lr.set(2, 2);
        lr.set(3, 3);
        lr.set(4, 4);
        System.out.println(lr.get(4));
        System.out.println(lr.get(3));
        System.out.println(lr.get(2));
        System.out.println(lr.get(1));
        lr.set(5, 5);
        System.out.println(lr.get(1));
        System.out.println(lr.get(2));
        System.out.println(lr.get(3));
        System.out.println(lr.get(4));
        System.out.println(lr.get(5));
        //  System.out.println(lr.get(2));
        //  System.out.println(lr.get(1));
    }
}
