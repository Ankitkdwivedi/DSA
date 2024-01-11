public class check_prime {
    public static void main(String[] args) {
        int n=79;
        System.out.println(isprime(n));
    }

    static boolean isprime(int n) {
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
