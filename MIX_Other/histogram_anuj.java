import java.util.*;

public class histogram_anuj {
    public static void main(String[] args) {
        int[] a = {2,1,3,6,4,7};
        int left[]=new int[a.length];
        int right[]=new int[a.length];
        left=histogram_left(a,left);
        right=histogram_right(a,right);
        for(int i=0;i<left.length;i++){
             
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

    }
    //next greater 
    static int[] histogram_left(int arr[],int []ans){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[i]>arr[s.peek()]){
                ans[s.pop()]=i;
            }
            s.push(i);
        }
            return ans;
    }
    static int[] histogram_right(int arr[],int []ans){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[i]>arr[s.peek()]){
                ans[s.pop()]=i;
            }
            s.push(i);
        }
            return ans;
    }
}
