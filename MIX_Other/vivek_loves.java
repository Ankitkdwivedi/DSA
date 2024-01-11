import java.util.*;
public class vivek_loves {
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int j=0;j<t;j++){
       int s=sc.nextInt();
       int arr[]=new int[s];
       for(int i=0;i<s;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println(rec(arr,0,s-1));
   }
    }
    static int rec(int[] arr,int a,int b){
       for(int i=a;i<b;i++){
       int currsum=0;
       for(int j=a;j<=i;j++){
           currsum+=arr[j];
       }
       int totalsum=0;
       for(int j=i+1;j<=b;j++){
           totalsum+=arr[j];
       }
       if(currsum==totalsum){
           int t1=rec(arr,a,i);
           int t2=rec(arr,i+1,b);
           return 1+Math.max(t1,t2);
       }
   }  
   return 0;
    }
}
    
