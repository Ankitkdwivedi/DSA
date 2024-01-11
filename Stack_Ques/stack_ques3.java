import java.util.*;
public class stack_ques3 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(12);
        st.push(15);
        st.push(61);
        st.push(18);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    static void reverse(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int item=st.pop();
        reverse(st);
        insert(st, item);
    }
    static void insert(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int k=st.pop();
        insert(st, ele);
        st.push(k);
    }
    
}
