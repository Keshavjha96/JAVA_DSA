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
        Node temp=new Node(val);
        if (tail==null) head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

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


    }
}
