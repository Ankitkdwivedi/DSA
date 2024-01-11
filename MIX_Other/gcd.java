public class gcd {
    public static void main(String[] args) {
        int a=4;
        int b=2;
        rec(a,b);
    }
    static void rec(int a,int b){
        if(a==0||b==0){
            return 1;
        }
    }
}
