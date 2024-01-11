public class two_d_queen {
    public static void main(String[] args) {
        int n=2;
        int r=2,c=2;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=i+1;
        }
    }
        int q=2;
        rec(r,c, q,"",0,0);
    }
    static void rec(int r,int c,int qtp,String ans,int cc,int cr){
        if(qtp==0){
            System.out.println(ans);
            return;
        }
        if(cc==c){
            cc=0;
            cr++;
        }
        if(cr==r) return;
        rec(r,c,qtp-1, ans+"Q{"+cr+","+cc+"}",cc+1,cr);
        rec(r,c,qtp, ans,cc+1,cr);
    }
}
