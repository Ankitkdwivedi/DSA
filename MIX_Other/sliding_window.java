public class sliding_window {
    public static void main(String[] args) {
      int arr[]={1};
      int k=1;
      System.out.println(sw(arr, k)); 
    }
    static int sw(int arr[],int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}
