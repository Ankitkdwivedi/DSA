import java.util.Scanner;

public class codefor {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        String s=sc.next();
        // int c=1;
        int l=0;
        int r=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='>') r++;
            else l++;
        }
        System.out.println(l-r+1);
    }
}
}
