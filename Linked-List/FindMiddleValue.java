
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} 

public class FindMiddleValue {
    int getMiddle(Node head) 
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count%2==0)
        {
            count=count/2+1;
        }
        else
        {
            count=count/2+1;
        }
        temp=head;
        while(count!=1)
        {
            temp=temp.next;
            count--;
        }
        return temp.data;
    }
}