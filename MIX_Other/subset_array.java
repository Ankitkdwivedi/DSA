public class subset_array {
    public static void main(String[] args) {
       int arr[]={1,2,3};
        rec(arr,"",0,3);
    }
    static void rec(int []arr,String ans,int idx,int t){
        if(t==0){
            System.out.print(ans+"  ");
            return;
        }
        if(t<0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            rec(arr, ans+" "+arr[i], idx+1, t-arr[i]);
        }
    }
}
