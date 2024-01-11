public class susbarraysum {
   public static void main(String[] args) {
    int []arr={-2,-4,23,3,-67};
    System.out.println(subsum(arr));
   }
   public static int subsum(int []arr) {
    int n=arr.length;
        int[]freq=new int [n];
        freq[0]=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            sum%=5;
            if(sum<0){
                sum+=n;
            }
            freq[sum]=freq[sum]+1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(freq[i]>=2){
            ans+=(freq[i]*(freq[i]-1))/2;
        }
        }
        return ans;
    }

}
