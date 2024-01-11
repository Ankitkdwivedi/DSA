public class keypad {
    public static void main(String[] args) { 
       key("23",""); 
    }
    static String []arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void key(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=arr[ch-48-1];
        for(int i=0;i<press.length();i++){
            key(ques.substring(1),ans+press.charAt(i) );
        }
    }
}
