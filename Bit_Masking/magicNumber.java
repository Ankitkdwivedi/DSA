package Bit_Masking;

public class magicNumber {
    public static void main(String[] args) {
        int n=12;
        int mul=5;
        int sum=0;
        while(n>0){
            if((n&1)!=0){
                sum+=mul;
            }
            n >>=1;
            mul*=5;
        }
        System.out.println(sum);
    }
}
