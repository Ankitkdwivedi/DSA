package Bit_Masking;

import java.util.Arrays;
import java.util.Scanner;

public class I_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        int h=(n+1)/2;
        double[][]dp=new double[n][h+1];
        for(double i[]:dp) Arrays.fill(i,-1);
        System.out.println(solve(arr, 0, h, dp));
    }
    static double solve(double[]coin,int i,int h,double[][]dp){
        if(h==0) return 1;
        if(i==coin.length){
            return 0;
        }
        if(dp[i][h]!=-1){
            return dp[i][h];
        }
        return dp[i][h]=coin[i]*solve(coin, i+1, h-1, dp)+(1-coin[i])*solve(coin, i+1, h, dp);
    }
}
