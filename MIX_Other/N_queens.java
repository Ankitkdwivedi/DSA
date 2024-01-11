public class N_queens {
    public static void main(String[] args) {
        int n=1;
        int[][] arr=new int[n][n];
        rec(arr, 0, n, 0);
        System.out.println(count);
    }
    static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isvalid(int arr[][],int row,int col,int n){
        //for row
        for(int i=0;i<n;i++){
            if(arr[row][i]==1){
                return false;
            }
        }
        //for col
        for(int i=0;i<n;i++){
            if(arr[i][col]==1){
                return false;
            }
        }
        //for upper left diagonal
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(arr[i][j]==1){
                return false;
            }
        }
        //for upper right diagonal
        for(int i=row, j=col; i>=0 && j<n; i--, j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
    static int count=0;
    static void rec(int [][]arr,int row,int n,int qpsf){
        if(qpsf==n){
           count++;
           System.out.println("bj"+count);
            return;
        }
        for(int col=0; col<n; col++){
            if(isvalid(arr, row, col, n)){
                arr[row][col]=1;
                rec(arr, row+1, n, qpsf+1);
                arr[row][col]=0;
            }
        }
    }
}
