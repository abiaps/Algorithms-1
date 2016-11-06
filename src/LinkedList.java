import java.util.List;

/**
 * Created by abiaps on 4/11/2016.
 */
public class LinkedList {
    public static void print(ListNode printnode)
    {
        ListNode printhead=printnode;
        while(printhead.next!=null)
        {
            System.out.print(printhead.val + "->" );
            printhead=printhead.next;
        }
        System.out.print(printhead.val);
        System.out.println();

    }
    //Union of two linkedlists            works
    public static ListNode union(ListNode l1,ListNode l2)
    {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode temp=head1;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head2;
        removeDuplicates(head1);
        return head1;
    }
    //Intersection of two linkedlists         not working
    public static void intersection(ListNode list1,ListNode list2)
    {
        ListNode intersection_node=new ListNode();
      //  ListNode intres=intersection_node;
        ListNode headint1=list1;
        ListNode headint2=list2;
        while((headint1!=null)||(headint2!=null))
        {
            if(headint1.val==headint2.val)
            {

                intersection_node.val=headint1.val;
                print(intersection_node);
               // intersection_node=intersection_node.next;
                headint1=headint1.next;
                headint2=headint2.next;
            }
            else
            {
               // headint1=headint1.next;
                headint2=headint2.next;
            }


        }
      //  return intersection_node;


    }
    // to check if a linked list is circular or not
    public static void circularOrNot(ListNode circular) {
        ListNode circularhead=circular;
        ListNode slowpointer=circularhead;
        ListNode fastpointer=circularhead;
        int i=0;
        while(fastpointer.next.next!=null)
        {
            i++;
            if (i % 2 == 0) {
                slowpointer = slowpointer.next;
                fastpointer = fastpointer.next.next;
            }
            else
                fastpointer = fastpointer.next.next;
            if (slowpointer == fastpointer)
            {
                System.out.println("It is circular at the point");
                break;
            }

        }
        System.out.print("It is not circular");
    }
    public static void middleElement(ListNode link)
    {
        ListNode middlehead=link;
        ListNode slow=middlehead;
        ListNode fast=middlehead;

        while(fast.next!=null)
        {

                fast=fast.next.next;
                slow=slow.next;
                if(fast==null)
                break;

        }
        System.out.print(slow.val +  "is the middle element");
    }
    //removing duplicates in a list
    public static ListNode removeDuplicates(ListNode dupnode)
    {
        ListNode removehead=dupnode;
        ListNode previous=dupnode;
        while(previous.next!=null)
        {
            ListNode current=previous.next;
            ListNode temp=current;
            while (current!=null)
            {

                if(current.val==previous.val)
                {

                   temp.next=current.next;
                    current=temp.next;
                }
                else{
                    temp=current;
                    current=temp.next;
                }

            }
            previous=previous.next;
        }
       return removehead;
    }
    public static void main(String[] args)
    {
        ListNode node=new ListNode();
        node.add(2);
        ListNode node1=new ListNode();
        node.next=node1;
        node1.add(5);
        ListNode node2=new ListNode();
        node1.next=node2;
        node2.add(7);

        ListNode node21=new ListNode();
        node2.next=node21;
        node21.add(2);

        ListNode node3=new ListNode();
        node21.next=node3;
        node3.add(9);
        ListNode node31=new ListNode();
        node31.add(7);
        node3.next=node31;
        node31.next=null;

        ListNode node4=new ListNode();
        node4.add(10);
        ListNode node5=new ListNode();
        node4.next=node5;
        node5.add(5);
        ListNode node6=new ListNode();
        node5.next=node6;
        node6.add(9);
        ListNode node7=new ListNode();
        node6.next=node7;
        node7.add(15);
        ListNode node8=new ListNode();
        node8.add(8);
        node7.next=node8;
        node8.next=null;
        //node8.next=node5;
          print(node);
       print(node4);
       ListNode union_result= union(node,node4);
      // print(union_result);
      //  intersection(node,node4);
     // circularOrNot(node4);
     //   middleElement(node);
      //  middleElement(node4);
     //   print(node);
        ListNode removedup=removeDuplicates(node);
        print(removedup);
       // print(intersection_result);
    }


}
