//https://hack.codingblocks.com/app/practice/1/1264/problem
package Bit_Masking;
public class Avengers_End_Game {
    // numbers are divisble 2 will be 1000/2 same for 3 and 5 but for common of 2 and 3 use set formula aUb=a+b-a^b
    public static void main(String[] args) {
        int []prime={2,3,5};
        int n=1000;
        System.out.println(Count(prime, n));
    }
    public static long Count (int []prime,int n){
        int len=prime.length;
        long ans=0;
        for(int i=1;i<(1<<len);i++){
            if((countSetBit(i)&1)!=0){
                ans+=interSection(prime,n,i);
            }
            else{
                ans-=interSection(prime,n,i);
            }
        }
        return ans;
    }
    static long countSetBit(int n){
        long c=0;
        while(n!=0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
    static long interSection(int []prime ,int n ,int i){
        long p=1;
        int pos=0;
        while(i>0){
            if((i&1)!=0){
                p*=prime[pos];
            }
            pos++;
            i>>=1;
        }
        return n/p;
    }
}
