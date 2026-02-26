package Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseKelementinQueue {
    public static void main(String[] args) {

    }
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (k>q.size() || k==0) return q;
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        while (k!=0){
            st.push(q.remove());
        }
        while (st.size()!=0){
            q.add(st.pop());
        }
        for (int i = 1; i <= n-k; i++) {
            q.add(q.remove());
        }
        return q;
    }
}
