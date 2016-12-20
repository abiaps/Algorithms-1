/**
 * Created by abiaps on 11/6/2016.
 */
public class hasCycle {
    public static boolean hasCycle(LcListNode head) {
        LcListNode prev = head;
        LcListNode cur = head.next;
        while (prev != null) {
            if (cur.next == prev) {
                return true;
            } else {
                cur = cur.next;
            }
            if ((cur.next == null) && (prev.next != null)) {
                prev = prev.next;
                cur = prev.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LcListNode l1 = new LcListNode(1);
        LcListNode l2 = new LcListNode(2);
        LcListNode l3 = new LcListNode(3);
        LcListNode l4 = new LcListNode(4);
        LcListNode l5 = new LcListNode(5);
        LcListNode l6 = new LcListNode(6);
        LcListNode l7 = new LcListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l6.next = l3;
        boolean status = hasCycle(l1);
        if (status == true) {
            System.out.println("Yes! it has cycle");

        } else
            System.out.println("No!it does not contain cycle");
    }
}

