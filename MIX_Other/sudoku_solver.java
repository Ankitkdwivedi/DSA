import java.util.*;
public class sudoku_solver {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rec(arr,0,0);
    }
    static void print(int arr[][]){
       for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        } 
    }
        static boolean issafe(int arr[][],int row,int col,int num){
            for(int a=0;a<arr.length;a++){
                if(arr[row][a]==num){
                    return false;
                }
            }
            for(int a=0;a<arr.length;a++){
                if(arr[a][col]==num){
                    return false;
                }
            }
            row=(row/3)*3;
            col=(col/3)*3;
            for(int i=row;i<row+3;i++){
                for(int j=col;j<col+3;j++){
                    if(arr[i][j]==num){
                        return false;
                    }
                }
            }
            return true;
        }
        static void rec(int arr[][],int cr,int cc){
            if(cc==arr.length){
                cc=0;
                cr++;
            }
            if(cr==arr.length){
                print(arr);
                return;
            }
            if(arr[cr][cc]==0){
            for(int i=1;i<=9;i++){
                if(issafe(arr,cr,cc,i)){
                    arr[cr][cc]=i;
                    rec(arr,cr,cc+1);
                    arr[cr][cc]=0;
                }
            }
        }
        else{
            rec(arr, cr, cc+1);
        }
        }
 }
