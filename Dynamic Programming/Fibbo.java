public class Fibbo{
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        // System.out.println(solve(n,dp));
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
    // static int solve(int n,int []dp){
    //     if(n<=1) return n;
    //     if(dp[n-1]!=0) return dp[n-1];
    //     return dp[n-1]=solve(n-1,dp)+solve(n-2,dp);
    // }
}