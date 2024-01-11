import java.util.Arrays;

public class Distinct_subsequence {
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabbit";
        System.out.println(numDistinct(s,t));
    }
    public static int numDistinct(String s, String t) {
        int dp[][]=new int [s.length()+1][t.length()+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(s, 0, t, 0,dp);
    }
    public static int solve(String s,int i,String t,int j,int dp[][]){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int inc=0;
        int exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=solve(s, i+1, t, j+1,dp);
        }
        exc=solve(s, i+1, t, j,dp);
        return dp[i][j]=inc+exc;
    }
}
