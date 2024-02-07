package Bit_Masking;

public class Minimum_Xor {
    public static void main(String[] args) {
        int a=11;
        int b=125;
        System.out.println(Min_Val(a, b));
    }

    public static int Min_Val(int a,int b){
        int c=CountSetBits(b);
        int x=0;
        for(int i=31;i>=0&&c>0;i--){
            if((a&(1<<i))!=0){
                x+=(1<<i);
                c--;
            }
        }
        for(int i=0;i<=31&&c>0;i++){
            if((a&(1<<i))==0){
                x+=(1<<i);
                c--;
            }
        }
        return x;
    }
    public static int CountSetBits(int n){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        return c;
    }
}
