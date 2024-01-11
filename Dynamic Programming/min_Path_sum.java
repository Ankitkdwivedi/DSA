import java.util.Arrays;

public class min_Path_sum {
    public static void main(String[] args) {
        int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(arr));
    }
    public static int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(grid,0,0,dp);
    }
    static int solve(int [][]arr,int i,int j,int dp[][]){
        if(i==arr.length-1&&j==arr[0].length-1) return arr[i][j];
        if(i>=arr.length||j>=arr[0].length) return 1000000;
        if(dp[i][j]!=-1) return dp[i][j];
        int o=solve(arr, i+1, j,dp);
        int s=solve(arr, i, j+1,dp);
        return dp[i][j]=arr[i][j]+Math.min(o,s);
    }
}
