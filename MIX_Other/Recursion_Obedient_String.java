public class Recursion_Obedient_String {
    public static void main(String[] args) {
        String ques="abba";
        System.out.println(rec(ques, "", false));
    }
    static boolean rec(String ques,String ans,boolean a){
        if(ques.length()==0){
           System.out.println(ans);
           a=true;
            return a;
        }
        if(ques.length()>=1&&ques.charAt(0)=='a'){
            rec(ques.substring(1), ans,a);
        }
        if(ques.length()>=2&&ques.substring(0, 2).equals("bb")){
            rec(ques.substring(2), ans,a);
        }
        // else{
        //     a=false;
        //     return a;
        // }
        return a;
    }
}
