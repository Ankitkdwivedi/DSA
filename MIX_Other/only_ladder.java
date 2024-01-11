import java.util.Scanner;
//static int c=0;
public class only_ladder {
    static int c=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] ladder=make_ladder(n);
        path(n, 0, ladder, "");
        System.out.println();
        System.out.println(c);
    }
    static void path(int n,int cc,int[]ladder,String ans){
        if(cc==n){
            System.out.println(ans+"END ,");
            c++;
            return;
        }
        if(cc>n) return;
        if(ladder[cc]!=0){
            path(n, ladder[cc], ladder, ans+cc+" ");
        }
        else{
        for(int dice=1;dice<=6;dice++){
            path(n, cc+dice, ladder, ans+cc+" ");
        }
    }
    }
    public static int[] make_ladder(int n){
        boolean[] prime=prime(n);
        int [] ladders=new int[n+1];
        int i=0;
        int j=prime.length-1;
        while(i<j){
            while(i<prime.length&&prime[i]==true){
                i++;
            }
            while(j>=0&&prime[j]==true){
                j--;
            }
            if(i<j){
                ladders[i]=j;
                i++;
                j--;
            }
        }
        return ladders;
                        
    }
    public static boolean[]prime(int n){
        boolean[] ans = new boolean[n+1];
        ans[0]=ans[1]=true;
        for(int i=2;i<ans.length;i++){
            if(ans[i]==false){
                for(int j=2;j*i<ans.length;j++){
                    ans[j*i]=true;
                }
            }
        }
        return ans;
    }
}
