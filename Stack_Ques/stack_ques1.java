import java.util.*;

public class stack_ques1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(12);
        st.push(15);
        st.push(61);
        st.push(18);
        System.out.println(last(st));
    }
    static int last(Stack<Integer> st){
        if(st.size()==1){
            return st.peek();
        }int item=st.pop();
        int x=last(st);
        st.push(item);
        return x;
    }
}
