public class good_string {
   public static void main(String[] args) {
    String s="aebciundaed";
    int count=0;
    int curr=0;
    for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            else{
                curr=Math.max(curr, count);
                count =0;
            }
        }
        System.out.println(curr);


   } 
}
