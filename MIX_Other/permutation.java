public class permutation {
    public static void main(String[] args) {
      String ques="123";
      per(ques,"");  
    }
    static void per(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String s1=ques.substring(0, i);
            String s2=ques.substring(i+1);
            System.out.println(s1+"      "+s2);
            per(s1+s2,ans+ch);
        }
    }
}
