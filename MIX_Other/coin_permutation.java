public class coin_permutation {
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
    int sum1=10;
    rec(arr,"",sum1);
    }
    static void rec(int[] arr,String ans,int sum){
        if(sum<0){
            return;
        }
        if(sum==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            rec(arr,ans+arr[i],sum-arr[i]);
        }
    }
}

