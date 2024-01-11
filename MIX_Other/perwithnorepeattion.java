import java.util.ArrayList;
import java.util.List;

public class perwithnorepeattion {
    public static void main(String[] args) {
        String ques="abca";
        List<String> l=new ArrayList<>();
        per(ques,"",l);
        System.out.println(l);
    }
    public static void per(String ques,String ans,List<String> l){
        if(ques.length()==0){
            if(!l.contains(ans)){
                l.add(ans);
                return;
            }
        }
        for(int i=0;i<ques.length();i++){
            boolean flag=true;
            char ch=ques.charAt(i);
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    flag=false;
                    break;
                }
            }
        if(flag==true){
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            per(s1+s2, ans+ch, l);

        }
    }
}
}
