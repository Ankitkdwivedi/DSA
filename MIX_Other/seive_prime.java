public class seive_prime {
    public static void main(String[] args) {
        seive_prime1(50);
    }
    //false-->prime
    //true -->not prime
    static void seive_prime1(int n){
        boolean []prime=new boolean[n+1];
        prime[0]=prime[1]=true;
        for(int i=0;i*i<prime.length;i++){
            if(prime[i]==false){
                for(int k=2;k*i<prime.length;k++){
                    prime[i*k]=true;
                }//n*log^log(n)
            }
        }
        for(int i=0;i<prime.length;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }

    }
}
