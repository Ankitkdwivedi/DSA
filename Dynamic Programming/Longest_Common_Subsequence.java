public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String text1 = "abc";
        String  text2 = "def" ;
        System.out.println(longestCommonSubsequence(text1,text2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        // return solve(text1, text2, 0, 0);
        int dp[][]=new int[text1.length()][text2.length()];
        String s=text1;
        String t=text2;
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                int ans=0;
                if(s.charAt(i-1)==t.charAt(j-1)){
                    ans=1+dp[i-1][j-1];
                }
                else{
                    int fs=dp[i-1][j];
                    int ss=dp[i][j-1];
                    ans=Math.max(fs, ss);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length][dp[0].length];
    }
    static int solve(String s,String t,int i,int j){
        if(i>=s.length()||j>=t.length()){
            return 0;
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=1+solve(s, t, i+1, j+1);
        }
        else{
            int fs=solve(s, t, i+1, j);
            int ss=solve(s, t, i, j+1);
            ans=Math.max(fs, ss);
        }
        return ans;
    }
}
