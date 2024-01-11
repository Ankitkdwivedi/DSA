import java.util.*;
public class stock_span {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};   
        span(arr);
    }

    public static void span(int[] arr) {
        int []ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
             }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
}
}
