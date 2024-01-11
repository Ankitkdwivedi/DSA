import java.util.*;

public class next_greater_element {
    public static void main(String[] args) {
        int[] arr = {11,2,3,23,13,9,15};  
        next_greater_element1(arr);
    }
    static void next_greater_element1(int []arr){
        int []ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                //System.out.println(st);
                ans[st.pop()]=arr[i];
                //System.out.println(st);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+"     "+ans[i]);
        }
    }
}
