package LinkedList;


public class DisplayList {
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next; //VERY IMPORTANT a=b
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 10 20 30 40 50
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(5);
        // Connect karenge (Link karenge)
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //display(a);
        displayRec(a);
//        private static int get(Node head,int idx){
//            Node temp=head
//            for(int i=1;i<=idx;i++){
//                temp= temp.next;
//            }
//            return temp.val;
//        }

    }
}
