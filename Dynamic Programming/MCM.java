import java.util.Arrays;

public class MCM {
   public static void main(String[] args) {
    int p[]={10,15,20,25};
    System.out.println(mcm(p));
   }
   public static int mcm(int[] p){
		int dp[][]=new int [p.length][p.length];
		for(int i[]:dp) Arrays.fill(i,-1);
		return solve(1,p.length-1,p,dp);

	}
	static int solve(int i,int j,int arr[],int dp[][]){
		if(i==j) return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		int max=Integer.MAX_VALUE;
		for(int k=i;k<j;k++){
			max=Math.min(max,arr[i-1]*arr[k]*arr[j]+solve(i,k,arr,dp)+solve(k+1, j, arr,dp));
		}
		return dp[i][j]=max;
	}
}
