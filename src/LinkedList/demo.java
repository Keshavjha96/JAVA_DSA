package LinkedList;

public class demo {
    public static void main(String[] args) {

    }
//    Definition for singly-linked list.
public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode slow = demo;
        ListNode fast = demo;
        for (int i = 1; i <=n ; i++) {
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return demo.next;


    }
}
