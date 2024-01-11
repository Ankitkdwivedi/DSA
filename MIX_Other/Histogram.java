import java.util.*;

public class Histogram {
    public static void main(String[] args) {
      int k=0;
        int arr[]={2,2,3,6,12};
        histogram(arr,k);
    }
    static void histogram(int arr[],int k){
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
              int h=arr[st.pop()];
              //System.out.println("hight is"+ h);
              int r=i;
              if(st.isEmpty()){
                int a=h*r;
                ans=Math.max(ans, a);
                //System.out.println("area is"+a);
              }
              else{
                int l=st.peek();
                int a=h*(r-l-1);
                ans=Math.max(ans, a);
                //System.out.println("area in else part"+a);
              }
               
        }
        st.push(i);
    }
    int r=arr.length;
    while(!st.isEmpty()){
        int h=arr[st.pop()];
        if(st.isEmpty()){
          int a=h*r;
          ans=Math.max(ans, a);
        }
        else{
          int l=st.peek();
          int a=h*(r-l-1);
          ans=Math.max(ans, a);
      }
  }
  
  System.out.println(ans);
}
}
