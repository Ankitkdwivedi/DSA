public class matrixrecursion{
    public static void main(String[] args) {
       int n=3;
       matrix(n, 0,0,""); 
    }
    static void matrix(int n,int cr,int cc,String ans){
        if(cr==n-1&&cc==n-1){
            System.out.println(ans+" ");
            return;
        }
        if(cr<n){
            matrix(n, cr+1, cc, ans+"V");

        }
        if(cc<n){
            matrix(n, cr, cc+1, ans+"H");
        }
    }
}