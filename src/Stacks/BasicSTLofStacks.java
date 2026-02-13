package Stacks;
import java.util.Stack;

public class BasicSTLofStacks {
    public static void main(String[] args) {
        Stack<String > st=new Stack<>();
        st.push("Keshav");
        st.push("jharna");
        st.push("palak");
        st.push("Madhav");
        System.out.println(st.size());
        System.out.println(st);// A.S=O(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
    }
}
