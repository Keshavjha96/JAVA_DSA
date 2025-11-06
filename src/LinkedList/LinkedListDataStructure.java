package LinkedList;

import java.util.LinkedList;

class Node{ //user defined data type
    int val;
    Node next; //null
    Node(int val){
        this.val=val;
    }
}
class linkedList{ //user defined data structure
    Node head; //null
    Node tail;
    int size;
    boolean search(int val){
        if (head==null) return false;
        Node temp=head;
        while(temp!=null){
            if (temp.val==val) return true;
            temp=temp.next;
        }
        return false;
    }
    void addAthead(int val){
        Node temp=new Node(val);
        if (head==null) head=tail=temp;
        else {
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void addAtTail(int val){
        if (tail == null){
          addAthead(val);
          return;
        }
        Node temp=new Node(val);
        tail.next=temp;
        tail=temp;
        size ++;
    }
    int get(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp= temp.next;
        }
        return temp.val;
    }
//    void addAtTail(int val){
//        Node temp=new Node(val);
//        if (tail==null) head=tail=temp;
//        else {
//            tail.next=temp;
//            tail=temp;
//        }
//        size++;
//    }

    void deleteAthead(){
        if (head==null){
            System.out.println("List is Empty!");
            return;
        }
        head=head.next;
        if (head==null) tail=null;
        size--;
    }

   void display() {
        if (head==null) return;
        Node temp=head;
        while (temp !=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
       System.out.println();
    }

    void insert(int val, int idx) {
        if (idx<0 || idx>size){
            System.out.println("Invalid Index!");
            return;
        }
        if (idx==0) addAthead(val);
        else if (idx==size)  addAtTail(val);
        else {
            Node temp=head;
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }

    void delete(int idx) {
        if (idx<0 || idx>=size){
            System.out.println("Invaild index!");
            return;
        }
        if (idx==0){
            deleteAthead();
            return;
        }
        Node temp=head;
        for (int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;//delete
        if (idx==size-1) tail=temp;//we are deleting tail
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
       linkedList ll=new linkedList();
       ll.deleteAthead();ll.display();
       ll.addAtTail(10);
       ll.addAtTail(20);
       ll.addAtTail(30);
       ll.addAtTail(40);
       ll.addAthead(50);
       ll.addAthead(60);
       ll.display();
       ll.deleteAthead();ll.display();
        System.out.println(ll.size);
        ll.insert(40,2);
        ll.display();
        System.out.println(ll.get(4));
        ll.delete(4);ll.display();
    }
}
