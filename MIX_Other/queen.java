public class queen {
    public static void main(String[] args) {
       int arr=1; 
       int box=4;
       int q=2;
       rec(arr,"", q,box);
    }
    static void rec(int arr,String ans,int q,int box){
        if(ans.length()==2){
             System.out.println(ans);
            return;
        }
        if(arr==box+1) return;
        rec(arr+1, ans+arr, q,box);
        rec(arr+1, ans, q,box);
    }
    
}
