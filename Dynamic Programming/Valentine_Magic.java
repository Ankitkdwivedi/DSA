import java.util.Scanner;

public class Valentine_Magic {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
        int b[]=new int[n];
        int g[]=new int[m];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            g[i]=sc.nextInt();
        }
		System.out.println(solve(b, g, 0, 0));
    }
    static int solve(int[]b,int g[],int i,int j){
        if(i==b.length) return 0;
        if(j==g.length) return 100000000;
        int pair=Math.abs(b[i]-g[j])+solve(b, g, i+1, j+1);
        int no_pair=solve(b, g, i, j+1);
        return Math.min(pair, no_pair);
    }
}
