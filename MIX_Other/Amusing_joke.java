import java.util.*;

public class Amusing_joke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String s=a+b;
        char s1[]=s.toCharArray();
        char total[]=sc.next().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(total);
        String str1=new String(s1);
        String str3=new String(total);
        if(str1.equals(str3)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
            }
  }
}
