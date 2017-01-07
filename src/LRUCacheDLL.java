import java.util.HashMap;

/**
 * Created by abiaps on 1/6/2017.
 */
public class LRUCacheDLL {
    public static class LRUCache {
        public class Node {
            int key;
            int val;
            Node prev;
            Node next;
        }

        HashMap<Integer, Node> cache = new HashMap<>();
        int cap = 0, count = 0;
        Node head, tail;

        public void addNode(Node n) {
            Node temp = head.next;
            n.next = temp;
            temp.prev = n;
            head.next = n;
            n.prev = head;
            cache.put(n.key, n);
            //  System.out.println(cache);
        }

        public void removeNode(Node n) {
            Node temp = n.prev;
            temp.next = n.next;
            n.next.prev = temp;
            cache.remove(n.key);
            // System.out.println(cache);
        }

        public LRUCache(int capacity) {
            cap = capacity;
            head = new Node();
            tail = new Node();
            head.prev = null;
            tail.next = null;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            Node cur = cache.get(key);
            if (cur == null) return -1;
            removeNode(cur);
            addNode(cur);
            System.out.println(cache);
            return cur.val;
        }

        public void set(int key, int value) {
            Node cur = cache.get(key);
            Node current = new Node();
            if (cur != null) {
                cur.val = value;
                removeNode(cur);
                addNode(cur);
            } else {
                if (count < cap) {
                    current.key = key;
                    current.val = value;
                    addNode(current);
                    ++count;
                } else {
                    removeNode(tail.prev);
                    current.key = key;
                    current.val = value;
                    addNode(current);
                }
                cache.put(key, current);
                System.out.println(cache);
            }
        }


    }

    public static void main(String args[]) {
        LRUCache lr = new LRUCache(2);
        lr.set(2, 1);
        lr.set(2, 2);
        System.out.println(lr.get(2));
        lr.set(1, 1);
        lr.set(4, 1);
        System.out.println(lr.get(2));
    }
}
