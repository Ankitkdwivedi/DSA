import java.util.*;
public class nknight {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n,c=n;
        int arr[][]=new int[n][n];
        int q=n;
        rec(arr,r,c, q,"",0,0);
        System.out.println("\n"+count);
    }
    static boolean isvalid(int arr[][],int r,int c,int n){
        if(r-2>=0&&c-1>=0&&arr[r-2][c-1]==1) return false;
        if(r-2>=0&&c+1<n&&arr[r-2][c+1]==1) return false;
        if(r-1>=0&&c-2>=0&&arr[r-1][c-2]==1) return false;
       if(r+1<n&&c-2>=0&&arr[r+1][c-2]==1) return false;
       if(r+2<n&&c-1>=0&&arr[r+2][c-1]==1) return false;
       if(r+2<n&&c+1<n&&arr[r+2][c+1]==1) return false;
        if(r-1>=0&&c+2<n&&arr[r-1][c+2]==1) return false;
        if(r+1<n&&c+2<n&&arr[r+1][c+2]==1) return false;
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
                if(isvalid(arr, cr, cc,arr.length)){
                arr[cr][cc]=1;
            rec(arr,r,c,ktp-1, ans+"{"+cr+"-"+cc+"} ",cc+1,cr);
            arr[cr][cc]=0;
            }
        rec(arr,r,c,ktp, ans,cc+1,cr);
    }
}
