public class flip_sliding_window {
    public static void main(String[] args) {
        String ques="abba";
        int k=2;
        int flipb=max(ques, k, 'b');
        int flipa=max(ques, k, 'a');
        System.out.println(Math.max(flipa, flipb));
        
    }
    static int max(String ques,int k,char ch){
        int flip=0;
       int si=0,ei=0;
       int ans=0;
       while(ei<ques.length()){
        if(ques.charAt(si)==ch){
            flip++;
        }
        while(flip>k&&si<=ei){
            if(ques.charAt(si)==ch){
                flip--;
            }
            si++;
        }
        ans=Math.max(ans, ei-si+1);
        ei++;
       }
       return ans;
    }
}
