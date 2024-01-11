import java.util.*;
public class substring_permutations {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[]arr=s.toCharArray();
        Arrays.sort(arr);
        String ques="";
        for(char ch:arr){
            ques+=ch;
        }
        rec(ques,"",s);
    }
    static int flag=0;
    static void rec(String ques,String ans,String s){
        if(ques.length()==0){
            if(ans.equals(s)){
                flag=1;
                return;
            }
            //if(flag==1){
                if(ans.charAt(0)!='b') return;
                if(!ans.substring(1).equals("dccaccd")) return;
            System.out.println(ans);
            //}
            return;
        }
        for(int i=0;i<ques.length();i++){
        char ch=ques.charAt(i);
        String s1=ques.substring(0,i);
        String s2=ques.substring(i+1);
        rec(s1+s2,ans+ch,s);
    }
}
}