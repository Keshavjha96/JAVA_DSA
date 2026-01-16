package LinkedList;

public class Reverselist {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static void displayrev(Node head) {
        if (head == null) return;
        displayrev(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayrev(a);  // Output: 3 5 1 2 4
    }
}
