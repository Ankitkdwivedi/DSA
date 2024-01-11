import java.util.*;
public class mapped {
    public static void main(String args[]) {
        // Your Code Here
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       int  n=123;
        String s=Integer.toString(n);
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=Character.getNumericValue(s.charAt(i));
        }
        HashMap<Integer,Character> ha=new HashMap<>();
        for(int i=1;i<=26;i++){
            ha.put(i,(char)('A'+i-1));
        }
        rec(arr,"",0,arr.length,ha);
    }
    static void rec(int []arr,String ans,int i,int j,HashMap<Integer,Character> ha){
        if(i==j){
            System.out.println(ans);
            return;
        }
        if(i<j){
    rec(arr,ans+ha.get(arr[i]),i+1,j,ha);
        }
        if((j-i)>=2&&(arr[i]*10+arr[i+1])<=26){
    rec(arr,ans+ha.get(arr[i]*10+arr[i+1]),i+2,j,ha);

    }
    }
}