package LinkedList;
public class DeleteNthFromEnd {
    private static Node nthNode(Node head,int n) {
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        //mth node from start
        temp=head;
        for (int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node deleteNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        // Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast==null){
            head=head.next;
            return head;
        }
        // Move both pointers until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Delete the nth node from end
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //100 13 4 5 12 10
       a= deleteNthFromEnd(a,6);
        display(a);

    }

}

