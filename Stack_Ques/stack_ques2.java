import java.util.*;
public class stack_ques2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(12);
        st.push(15);
        st.push(61);
        st.push(18);
        int ele=-7;
        System.out.println(st);
        insert_bottom_last(st,ele);
        System.out.println(st);
    }
    static void insert_bottom_last(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(-7);
            return;
        }int item=st.pop();
        insert_bottom_last(st,ele);
        st.push(item);
    }
}
