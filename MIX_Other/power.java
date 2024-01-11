public class power {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        System.out.println(pow(a,b));
    }
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int ans=pow(a,b/2);
        ans=ans*ans;
        if(b%2!=0){
            ans=ans*a;
        }
        return ans;
    }
}
