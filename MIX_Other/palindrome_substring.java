public class palindrome_substring {
    public static void main(String[] args) {
        String s="naman";
        palin_substr(s);
    }
    // public static void palin_substr(String s){
    //     int i=0;
    //     int j=s.length()-1;         //Method to check the palindrome number by two pointer approach
    //     while(i<=j){
    //         if(s.charAt(i)!=s.charAt(j)){
    //             System.out.println("this is not a palindrome substring");           
    //             break;
    //         }
    //         i++;
    //         j--;
    //     }
    // }
    public static void palin_substr(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(check_palin(s.substring(i,j))==true){
                    System.out.println(s.substring(i, j));
                }
            }
        }
    }
    public static boolean check_palin(String ques){
        int i=0;
        int j=ques.length()-1;
        while(i<=j){
            if(ques.charAt(i)!=ques.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
