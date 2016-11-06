import java.util.List;

/**
 * Created by abiaps on 11/5/2016.
 */
public class AddTwoNumbersLinkedlist {


    public static LcListNode calculateSum(LcListNode l1, LcListNode l2)
    {
        LcListNode l3=null;
        int sum=0,count1=0,count2=0;
        int rem=0;
        LcListNode result=null,temp1=l1,temp2=l2;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        while(temp1!=null){
          count1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        if(count1>count2)
        {
             l3=l1;
        }
        else {
             l3 = l2;
        }

        while(l1!=null&&l2!=null) {

            sum+=l1.val+l2.val;

            rem=sum%10;
            l1.val=rem;
            sum=sum/10;
            result=l1;
            l1=l1.next;
            l2=l2.next;


        }
        while(l1!=null)
        {
            sum+=l1.val;
            rem=sum%10;
            l1.val=rem;
            sum=sum/10;
            result=l1;
            l1=l1.next;

        }
        while(l2!=null)
        {

            sum+=l2.val;
            rem=sum%10;
            l2.val=rem;

            result=l2;
            l1=result;
            sum=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        if(sum>0)
        {
            LcListNode temp=new LcListNode(sum);
            result.next=temp;
        }

        return l3;
    }
    public static void main(String[] args)
    {
        LcListNode l1=new LcListNode(5);
        LcListNode l12=new LcListNode(7);
        LcListNode l13=new LcListNode(2);
        l1.next=l12;
        l12.next=l13;

        LcListNode l2=new LcListNode(2);
        LcListNode l21=new LcListNode(3);
        LcListNode l22=new LcListNode(5);
        LcListNode l23=new LcListNode(8);
        l2.next=l21;
        l21.next=l22;
l22.next=l23;
        LcListNode result=calculateSum(l1,l2);
        System.out.println(result);

    }
}
