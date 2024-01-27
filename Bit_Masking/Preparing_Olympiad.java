import java.util.Scanner;

public class Preparing_Olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int l =sc.nextInt();
        int r =sc.nextInt();
        int x =sc.nextInt();
        int arr[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=3;i<=(1<<n);i++){
            long sb=setBits(i);
            if(sb>=2&&isitpossible(arr,i,l,r,x)){
                ans++;
            }

        }
        System.out.println(ans);

    }
    static long setBits(int n){
        long c=0;
        while(n!=0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }

    static boolean isitpossible(int arr[],int i,int l,int r,int x){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int pos=0;
        long sum=0;
        while(i>0){
            if((i&1)==1){
                sum+=arr[pos];
                min=Math.min(arr[pos],min);
                max=Math.max(arr[pos],max);
            }
            pos++;
            i>>=1;
        }
        // if(sum>=l&&sum<=r&&max-min>=x) return true;
        if(sum>=l&sum<=r&max-min>=x) return true;
        return false;
    }
}
