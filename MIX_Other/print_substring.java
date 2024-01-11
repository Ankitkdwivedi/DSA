public class print_substring {
    public static void main(String[] args) {
        String s="abc";
      print(s);  
    }
    public static void print(String s){
        for(int len=1;len<=s.length();len++){
            for(int start=0;start<=s.length()-len;start++){
                int end=start+len;
                System.out.println(s.substring(start, end));

            }
        }
    }
}
