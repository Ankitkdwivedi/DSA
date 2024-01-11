public class N_knight {
    public static void main(String[] args) {
        int n=2;
        int r=2,c=2;
        int arr[][]=new int[n][n];
        int q=2;
        rec(arr,r,c, q,"",0,0);
        System.out.println("\n"+count);
    }
    static boolean isvalid(int arr[][],int r,int c){
        if(r-2>=0&&c-1>=0&&arr[r][c]==1) return false;
        if(r-2>=0&&c+1>=0&&arr[r][c]==1) return false;
        if(r-1>=0&&c-2>=0&&arr[r][c]==1) return false;
       // if(r+1>=0&&c-2>=0&&arr[r][c]==1) return false;
       // if(r+2>=0&&c-1>=0&&arr[r][c]==1) return false;
       // if(r+2>=0&&c+1>=0&&arr[r][c]==1) return false;
        if(r-1>=0&&c+2>=0&&arr[r][c]==1) return false;
        // if(r+1>=0&&c+2>=0&&arr[r][c]==1) return false;
        return true;

    }
    static int count=0;
    static void rec(int arr[][],int r,int c,int ktp,String ans,int cc,int cr){
        if(ktp==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(cc==c){
            cc=0;
            cr++;
        }
        if(cr==r) return;
        if(isvalid(arr, cr, cc)){
            arr[cr][cc]=1;
        rec(arr,r,c,ktp-1, ans+"{"+cr+"-"+cc+"} ",cc+1,cr);
            arr[cr][cc]=0;
        }
        rec(arr,r,c,ktp, ans,cc+1,cr);
    }
}
