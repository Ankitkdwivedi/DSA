package String_Algo;

public class Longest_Happy_Prefix {
    public static void main(String[] args) {
        String s="level";
    }
    
    public String longestPrefix(String s) {
        String ans="";
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
        return  s.substring(0,lps[s.length()-1]);
    }
}
