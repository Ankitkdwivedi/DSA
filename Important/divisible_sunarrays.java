import java.util.*;
public class divisible_sunarrays {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
       int t = scn.nextInt(); 
       while(t-->0){
          int n = scn.nextInt(); 
          int[] arr=new int[n];
          for (int i = 0; i < n; i++) 
           arr[i]=scn.nextInt();
           System.out.println(subarraysDivByK(arr, n)); 
       }
   }
   public static long subarraysDivByK(int[] nums, int k) {
       // Write your code here
       int n=nums.length;
       long s=0;
       long f[]=new long [n+1];
       f[0]++;
       for(int i=0;i<n;i++){
           s+=nums[i];
           int idx=(int)(s%n);
           if(idx<0){
               idx+=n;
           }
           f[idx]++;
       }
       long ans=0;
		for(int i=0;i<=n;i++){
			if(f[i]>=2){
				long a=f[i];
                ans+=a*(a-1)/2;

			}
		}
		return ans;
    }

}