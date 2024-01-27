import java.util.Scanner;

public class Tavas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n =s.length();
        int x=(1<<n) -2; //n-1 tk ke saare lucky numbers  means (2^n-2) calculation
        int y=0,pos=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='7'){
                y+=(1<<pos);
            }
            pos++;
        }
        int ans=x+y+1;
        System.out.println(ans);
    }
}
