package String_Algo;

public class Hash_Code {
    public static void main(String[] args) {
        String str="APPLE";
        System.out.println(hash(str));
    }
    public static long hash(String str){
        long mod=1000_000_007;
        long pow=1;
        long p=31;
        long hv=0;
        for(int i=0;i<str.length();i++){
            int pos=str.charAt(i)-'A'+1;
            hv=(hv+(pos*pow)%mod)%mod;
            pow=(pow*p)%mod;
        }
        return hv;
    }
}
