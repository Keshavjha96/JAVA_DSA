package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyStack{
    Node head;
    int len;
    int peak() throws Exception{
        if(head==null){
            throw new Exception("Stack is underflow Error");
    }
        return head.val;
    }
    int pop() throws Exception{
        if(head==null){
         throw new Exception("Stack is underflow Error");

        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int ele){
        Node temp =new Node(ele);
        if(len==0) head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        len++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LLImplementationofStacks {
    public static void main(String[] args) throws Exception{
        MyStack st=new MyStack();
        st.pop();
        st.push(10); st.push(20); st.push(30); st.push(40);
        st.display();
        st.pop();
        st.display();
    }
}
