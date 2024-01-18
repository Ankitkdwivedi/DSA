package Bit_Masking;

public class countSetBit {
    // public static void main(String[] args) {
    //     int n=67;
    //     int count=0;
    //     while (n>0) {
    //         count++;
    //         n=n&(n-1);
    //     }
    //     System.out.println(count);
    // }
    public static void main(String[] args) {
        // max o(32) or o(1) of o(logn)
        int n=67;
        int count=0;
        while(n>0){
            if((n&1)==1) count++;
            n>>=1;
        }
        System.out.println(count);
    }
}
