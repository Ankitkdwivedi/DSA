public class Knapsack_DP {
    public static void main(String[] args) {
        int []wt={1,2,3,2,2};
        int []val={8,4,0,5,3};
        int cap=4;
        int dp[][]=new int [cap+1][n+1];
        System.out.println(solve(wt, val, cap, 0));
    }
    static int solve(int []wt,int []val,int cap,int i){
        if(i==wt.length||cap==0) return 0;
        int inc=0;
        int exc=0;
        if(cap>=wt[i]){
            inc=val[i]+solve(wt, val, cap-wt[i], i+1);
        }
        exc=solve(wt, val, cap, i+1);
        return Math.max(inc,exc);
    }
}
