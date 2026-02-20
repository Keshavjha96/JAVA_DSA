package Stacks;
import java.util.Stack;

public class BasicSTLofStacks {
    public static void main(String[] args) {
        Stack<String > st=new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        st.push("Keshav");
        st.push("jharna");
        st.push("palak");
        st.push("Madhav");
        System.out.println(st.size());
        System.out.println(st);// A.S=O(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());//it returns the topmost element and removes it
        String s=st.pop();
    }
}
