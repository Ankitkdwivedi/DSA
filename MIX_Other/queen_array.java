public class queen_array {
    public static void main(String[] args) {
        int n=4;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int q=2;
        rec(arr, 0, q, "");
    }
    static void rec(int []arr,int idx,int q,String ans){
        if(ans.length()==2){
            System.out.println(ans);
            return;
        }
        if(idx==arr.length){
            return;
        }
        rec(arr, idx+1, q, ans+arr[idx]);
        rec(arr, idx+1, q, ans);
    }
}
