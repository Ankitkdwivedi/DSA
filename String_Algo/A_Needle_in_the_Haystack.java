package String_Algo;

import java.util.Scanner;

public class A_Needle_in_the_Haystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            String p = sc.next();
            String t = sc.next();
            KMP(p,t);
        }
    }
    public static void KMP(String p,String t) {
        String s=p+"#"+t;
        int lps[]=new int[s.length()];
        lps[0]=0;
        int i=1;
        int len=0;
        while(i<s.length()){
            if(s.charAt(len)==s.charAt(i)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
            if(len>0) len=lps[len-1];
            else i++;
            }
        }
        for(int j=p.length();j<lps.length;j++){
            if(lps[j]==p.length()) System.out.println(j-2*p.length());
        }
    }
    
}
